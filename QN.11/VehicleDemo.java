class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

// Subclass Car that overrides display()
class Car extends Vehicle {
    void display() {
        super.display(); // Calls the display() method of Vehicle class
        System.out.println("This is a Car. 🚗");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display(); // Calls overridden method
    }
}
