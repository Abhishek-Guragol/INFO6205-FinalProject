import networkx as nx
import matplotlib.pyplot as plt

def build_tree(root, depth):
    if depth == 0:
        return
    
    left_u = root['u']
    left_v = root['v'] + 2 * root['u']
    left_child = {'u': left_u, 'v': left_v}
    
    middle_u = root['v']
    middle_v = root['u'] + 2 * root['v']
    middle_child = {'u': middle_u, 'v': middle_v}
    
    right_u = root['v']
    right_v = 2 * root['v'] - root['u']
    right_child = {'u': right_u, 'v': right_v}
    
    root['left'] = left_child
    root['middle'] = middle_child
    root['right'] = right_child
    
    build_tree(left_child, depth - 1)
    build_tree(middle_child, depth - 1)
    build_tree(right_child, depth - 1)

def add_edges_to_graph(node, graph):
    for child in ['left', 'middle', 'right']:
        if child in node:
            graph.add_edge(str(node), str(node[child]))
            add_edges_to_graph(node[child], graph)

def visualize_tree(tree, pos=None, ax=None, parent_name=None, graph=None, level=0, width=2., vert_gap=0.4, xcenter=0.5):
    if pos is None:
        pos = {str(tree): (xcenter, 1 - level * vert_gap)}
    else:
        pos[str(tree)] = (xcenter, 1 - level * vert_gap)
    neighbors = list(graph.neighbors(str(tree)))
    if not isinstance(graph, nx.DiGraph) and parent_name is not None:
        neighbors.remove(str(parent_name))
    if len(neighbors) != 0:
        dx = width / 2
        nextx = xcenter - width/2 - dx/2
        for neighbor in neighbors:
            nextx += dx
            pos = visualize_tree(neighbor, pos=pos, ax=ax, parent_name=str(tree), graph=graph, level=level+1, width=dx, xcenter=nextx)
    return pos

def get_labels(tree):
    return f"[{tree['v'] - tree['u']}, {tree['u']}, {tree['v']}, {tree['u'] + tree['v']}]"

# Create the root node
root_node = {'u': 1, 'v': 2}
depth = 5  # Adjust the depth as needed

# Build the tree
build_tree(root_node, depth)

# Create a directed graph
G = nx.DiGraph()

# Add nodes and edges to the graph
G.add_node(str(root_node))
add_edges_to_graph(root_node, G)

# Visualize the tree
pos = visualize_tree(root_node, graph=G)

# Draw the graph with customization
fig, ax = plt.subplots(figsize=(10, 8))
labels = {str(node): get_labels(eval(node)) for node in G.nodes}
nx.draw(G, pos=pos, with_labels=True, labels=labels, arrowsize=20, ax=ax, node_size=700, font_size=10, font_color='black', font_weight='bold', node_color="white", edge_color="gray")
plt.title("Tree Visualization")
plt.show()
