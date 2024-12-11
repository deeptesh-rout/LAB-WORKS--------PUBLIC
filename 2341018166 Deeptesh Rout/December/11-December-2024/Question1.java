/*Q1. (a) Write a Java program to create a class Employee with private fields name, id, and salary.  
(b) Add a method displayDetails() in the Employee class to display the employee's details.  
(c) Demonstrate the concept of encapsulation by accessing private fields through the methods.  */


// Q1. Demonstration of Encapsulation

class Employee {
    // Private fields (Encapsulation)
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize the employee object
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter and Setter methods to access private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display the employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", 101, 50000.00);

        // Display employee details using displayDetails()
        emp.displayDetails();

        // Modify employee details using setter methods
        emp.setName("Jane Smith");
        emp.setId(102);
        emp.setSalary(55000.00);

        // Access and display updated employee details using getter methods
        System.out.println("\nUpdated Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Salary: " + emp.getSalary());

        // Display details using displayDetails() after updates
        System.out.println("\nDetails from displayDetails() method:");
        emp.displayDetails();
    }
}