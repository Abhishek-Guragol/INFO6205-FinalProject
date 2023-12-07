package generators.trees;

import utils.Node;

public class PathSearcher {

    public String searchPath(Node root, int a, int b, int c, int d) {
        StringBuilder path = new StringBuilder();
        boolean found = searchTree(root, a * c, b * d, path);
        return found ? path.toString() : "No matching node found.";
    }

    private boolean searchTree(Node node, int targetU, int targetV, StringBuilder path) {
        if (node == null) {
            return false;
        }

        if (node.u == targetU && node.v == targetV || (((node.v - node.u) == targetU) && ((node.v + node.u) == targetU))){
            return true; // Found a matching node
        }

        // Check left subtree
        path.append("l");
        if (searchTree(node.getLeft(), targetU, targetV, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        // Check middle subtree
        path.append("m");
        if (searchTree(node.getMid(), targetU, targetV, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        // Check right subtree
        path.append("r");
        if (searchTree(node.getRight(), targetU, targetV, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        return false;
    }
}

