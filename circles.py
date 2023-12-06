import matplotlib.pyplot as plt
import numpy as np

def plot_right_angle_triangle(a, b, c, d):
    plt.plot([0, -a*d, 0, 0], [0, 0, 2*b*c, 0], 'b-')

def plot_circle(radius, center_x, center_y,n):
    theta = np.linspace(0, 2*np.pi, 100)
    x_circle = center_x + radius * np.cos(theta)
    y_circle = center_y + radius * np.sin(theta)
    plt.plot(x_circle, y_circle, 'r-')
    if(n>8):
        plt.text(center_x, center_y, radius, ha='center', va='center', color='blue')

def main():
    a, b, c, d = 1,1,2,3  # Replace these values with your numbers

    for i in range(0,10):
    # Plot the right-angle triangle
        plot_right_angle_triangle(a, b, c, d)

        # Plot circles
        plot_circle(a*c, -a*c, -a*c,i)  # Circle in the fourth quadrant
        plot_circle(b*d, b*d, b*d,i)    # Circle in the second quadrant
        plot_circle(c*d, -c*d, c*d,i) 
        
        temp = c+d
        a = b
        b = c
        c = d
        d = temp
        print(a,b,c,d)

        plot_right_angle_triangle(a, b, c, d)

        # Plot circles
        plot_circle(a*c, -a*c, -a*c,i)  # Circle in the fourth quadrant
        plot_circle(b*d, b*d, b*d,i)    # Circle in the second quadrant
        plot_circle(c*d, -c*d, c*d,i) 
    
    # plt.text(-a*c, -a*c, a*c,ha='center', va='center', color='blue')  # Circle in the fourth quadrant
    # plt.text(b*d, b*d, b*d,ha='center', va='center', color='blue')    # Circle in the second quadrant
    # plt.text( -c*d, c*d, c*d,ha='center', va='center', color='blue' )
    plt.xlim([-2.5*c*d, 2.5*c*d])
    plt.ylim([-2.5*c*d, 2.5*c*d])

    # Display the plot
    plt.xlabel('X-axis')
    plt.ylabel('Y-axis')
    plt.title('Geometric Elements Plot')
    plt.grid(True)
    plt.axhline(0, color='black', linewidth=0.5)
    plt.axvline(0, color='black', linewidth=0.5)
    plt.show()

if __name__ == "__main__":
    main()
