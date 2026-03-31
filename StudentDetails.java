
package simplejavaprograms;
import java.util.ArrayList;
import java.util.Scanner;

class StudentName {
    String name;
    int rollno;

    StudentName(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    class StudentsMarks {
        int mark1, mark2, mark3;

        StudentsMarks(int mark1, int mark2, int mark3) {
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }

        void display() {
            int total = mark1 + mark2 + mark3;
            double avg = total / 3.0;

            System.out.println("Student Name: " + name);
            System.out.println("Roll No: " + rollno);
            System.out.println("Marks are " + mark1 + ", " + mark2 + ", " + mark3);
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + avg);
        }
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Students: ");
        int n = sc.nextInt();
        sc.nextLine(); // fix for nextLine issue

        StudentName[] sn = new StudentName[n];
        StudentName.StudentsMarks[] marks = new StudentName.StudentsMarks[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll no: ");
            int roll = sc.nextInt();

            System.out.print("Enter 3 subject marks: ");
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            sn[i] = new StudentName(name, roll);
            marks[i] = sn[i].new StudentsMarks(s1, s2, s3); // fixed here
        }

        // Search
        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (sn[i].name.equalsIgnoreCase(searchName)) {
                marks[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}
/*
import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    class Marks {
        int s1, s2, s3;

        Marks(int s1, int s2, int s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }

        void display() {
            int total = s1 + s2 + s3;
            double avg = total / 3.0;

            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + s1 + ", " + s2 + ", " + s3);
            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        Student.Marks[] marks = new Student.Marks[n];

        // Input
        for (int i = 0; i < n; i++) {
           
        }

        

        
    }
}
*/