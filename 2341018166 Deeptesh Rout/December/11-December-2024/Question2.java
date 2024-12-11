/*Q2. (a) Write a Java program to demonstrate the IS-A relationship by creating a Vehicle class and a subclass Car with additional properties. Add a display() method to show polymorphic behavior. 
(b) Implement a HAS-A relationship by adding an Engine class and including it as a property in the Car class. Add a method startEngine() in the Engine class and call it from the Car class. 
(c) Demonstrate polymorphism by creating a list of Vehicle objects (both Vehicle and Car) and calling the display() method on each object. */


// Q2. Demonstration of IS-A and HAS-A relationships

// Base class (IS-A relationship)



class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Polymorphic display method
    public void display() {
        System.out.println("This is a vehicle of brand: " + brand);
    }
}

// Subclass (IS-A relationship)
class Car extends Vehicle {
    private String model;
    private Engine engine; // HAS-A relationship

    public Car(String brand, String model, Engine engine) {
        super(brand);
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startEngine() {
        if (engine != null) {
            engine.startEngine();
        } else {
            System.out.println("No engine to start.");
        }
    }

    // Override display method to show polymorphic behavior
    @Override
    public void display() {
        System.out.println("This is a car of brand: " + getBrand() + ", model: " + model);
    }
}

// Engine class (HAS-A relationship)
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void startEngine() {
        System.out.println("The " + type + " engine is starting...");
    }
}

public class Question2 {
    public static void main(String[] args) {
        // Create Vehicle and Car objects
        Vehicle vehicle1 = new Vehicle("Generic Brand");
        Engine carEngine = new Engine("V8");
        Car car1 = new Car("Toyota", "Corolla", carEngine);

        // Demonstrate polymorphism
        System.out.println("Displaying all vehicles:");
        vehicle1.display();
        car1.display();

        // Demonstrate HAS-A relationship
        System.out.println("\nStarting the car's engine:");
        car1.startEngine();
    }
}