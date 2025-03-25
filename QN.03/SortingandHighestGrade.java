import java.util.Scanner;
import java.util.Arrays;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display() {
        System.out.println(name + "\t" + age + "\t" + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name, age, grade: ");
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(students, (a, b) -> Double.compare(b.grade, a.grade));

        System.out.println("\nSorted Student List:");
        System.out.println("_____________________________");
        System.out.println("Name\tAge\tGrade");
        System.out.println("_____________________________");

        for (Student s : students) {
            s.display();
        }

        System.out.println("_____________________________");

        System.out.println("\nTop Student:");
        System.out.println("_____________________________");
        students[0].display();
        System.out.println("_____________________________");
        sc.close();
    }
}
