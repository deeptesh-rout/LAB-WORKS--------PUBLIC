/*Q4. (a) Create a package mypackage containing a class Student with attributes name and rollNumber.  
(b) Use the this keyword in a constructor to resolve variable shadowing. 
(c) Add a method displayDetails() in the Student class to print the student's details.   */

// Save this file as Student.java inside the folder "mypackage"
//package mypackage;

// Define the Student class


// Define the Student class in the mypackage package
//package mypackage;

class Student {
    private String name;
    private int rollNumber;

    // Constructor using 'this' keyword to resolve shadowing
    public Student(String name, int rollNumber) {
        this.name = name; // Resolves shadowing of name
        this.rollNumber = rollNumber; // Resolves shadowing of rollNumber
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}


public class Question4 {
    public static void main(String[] args) {
        // Import the mypackage package
        Student student = new Student("Deeptesh Rout", 101);

        // Display the student's details
        student.displayDetails();
    }
}