class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age); 
        this.salary = salary;
    }

    void display() {
        super.display(); 
        System.out.println("Salary: " + salary);
    }
}


public class MainPerson {
    public static void main(String[] args) {
        Employee emp = new Employee("Samman", 20, 50000);
        emp.display();
    }
}
