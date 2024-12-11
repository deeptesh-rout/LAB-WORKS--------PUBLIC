/* */
/*Q5. (a) Write a program that demonstrates the use of super to call the parent class constructor 
and methods.  
(b) Create a parent class Animal and a subclass Dog with additional behavior. 
(c) Create an interface Speak with a method makeSound(). Implement it in the Animal and Dog 
classes to demonstrate polymorphism. */

// Demonstrating the use of super to call the parent class constructor and methods
class Parent {
    String name;

    Parent(String name) {
        this.name = name;
        System.out.println("Parent constructor called for " + this.name);
    }
    void greet() {
        System.out.println("Hello, I am " + this.name + " from the Parent class.");
    }
}

class Child extends Parent {
    int age;

    // Constructor of Child class
    Child(String name, int age) {
        super(name); // Calls the parent class constructor
        this.age = age;
        System.out.println("Child constructor called. Age: " + this.age);
    }

    // Method in Child class
    void introduce() {
        super.greet(); // Calls the parent class method
        System.out.println("I am " + this.age + " years old from the Child class.");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Child child = new Child("Deeptesh", 20);
        child.introduce();
    }
}
