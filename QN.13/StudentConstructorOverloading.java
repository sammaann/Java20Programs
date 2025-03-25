class Student {
    String name;
    int age;
    double grade;

    // Constructor 1: Initializes only the name
    public Student(String name) {
        this.name = name;
        this.age = 0;       // Default age
        this.grade = 0.0;   // Default grade
    }

    // Constructor 2: Initializes name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0;   // Default grade
    }

    // Constructor 3: Initializes name, age, and grade
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Student s1 = new Student("Samman");
        Student s2 = new Student("Deepsan", 21);
        Student s3 = new Student("Aayush", 22, 89.5);

        // Displaying student details
        System.out.println("Student Details:");
        s1.display();
        s2.display();
        s3.display();
    }
}
