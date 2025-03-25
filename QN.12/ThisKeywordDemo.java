class Person {
    String name;
    int age;

    // Constructor using 'this' to refer to instance variables
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor Overloading - Calls another constructor using 'this()'
    public Person() {
        this("Unknown", 0); // Calls the above constructor with default values
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    void introduce() {
        System.out.println("Introducing myself:");
        this.display(); 
    }

    public static void main(String[] args) {
        Person p1 = new Person("Samman", 21); // Using parameterized constructor
        Person p2 = new Person(); // Using default constructor

        System.out.println("Person 1 Details:");
        p1.introduce(); 

        System.out.println("\nPerson 2 Details:");
        p2.introduce(); 
    }
}
