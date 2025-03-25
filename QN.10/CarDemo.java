class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass Car that overrides start()
class Car extends Vehicle {
    void start() {
        super.start(); // Calls the superclass method
        System.out.println("Car engine is now ON! 🚗💨");
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Calls overridden method
    }
}
