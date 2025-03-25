import java.util.Arrays;

abstract class Shape {
    abstract double area(); 
}

class Circle extends Shape {
    double radius;

    Circle() {
        this.radius = 1.0;
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding area() method
    double area() {
        return Math.PI * radius * radius;
    }
}

// Square class inheriting Shape
class Square extends Shape {
    double side;

    // Default Constructor
    Square() {
        this.side = 1.0;
    }

    // Parameterized Constructor
    Square(double side) {
        this.side = side;
    }

    // Overriding area() method
    double area() {
        return side * side;
    }
}

// ShapeManager class to handle Shape objects
class ShapeManager {
    Shape[] shapes; // Array to store multiple shapes

    ShapeManager(Shape[] shapes) {
        this.shapes = shapes;
    }

    // Find shape with the largest area
    void findLargestShape() {
        Shape largest = shapes[0];
        for (Shape s : shapes) {
            if (s.area() > largest.area()) {
                largest = s;
            }
        }
        System.out.println("Largest Shape: " + (largest instanceof Circle ? "Circle" : "Square") +
                ", Area: " + largest.area());
    }

    // Sort shapes in descending order of area
    void sortShapes() {
        Arrays.sort(shapes, (a, b) -> Double.compare(b.area(), a.area()));
        System.out.println("\nShapes Sorted by Area:");
        for (Shape s : shapes) {
            System.out.println((s instanceof Circle ? "Circle" : "Square") + " - Area: " + s.area());
        }
    }
}

// Main Class
public class Shape_Inheritance {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Circle(3),
            new Square(7)
        };

        ShapeManager manager = new ShapeManager(shapes);
        manager.findLargestShape();
        manager.sortShapes();
    }
}
