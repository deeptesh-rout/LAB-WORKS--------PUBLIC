/*Q3. (a) Write a Java program to create a class Rectangle with attributes length and breadth.  
(b) Use a constructor to initialize these values. 
(c) Add a method calculateArea() to compute and return the area of the rectangle.   */

// Define the Rectangle class
class Rectangle {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Calculate and display the area
        System.out.println("The area of the rectangle is: " + rect.calculateArea());
    }
}