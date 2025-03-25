import java.util.Arrays;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    public void display() {
        System.out.println(name + " - " + marks);
    }
}

public class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            students[i] = new Student(name, marks);
        }

        // Sorting in descending order of marks
        Arrays.sort(students, (a, b) -> Integer.compare(b.marks, a.marks));

        // Display sorted students
        System.out.println("\nSorted Students (Descending Order of Marks):");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
