
package advancedjavaapplication;
import java.util.Scanner;
import java.util.ArrayList;

public class Main5 {
    static ArrayList<Student4> studentList=new ArrayList<>();
    
    // Check if roll number already exists
    public static boolean isRollNumberExists(int rollno) {
        for (Student4 s : studentList) {
            if (s.rollno == rollno) {
                return true;
            }
        }
        return false;
    }

    // Add student
    public static void addStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        if (isRollNumberExists(roll)) {
            System.out.println("Roll Number already exists!");
            return;
        }

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        studentList.add(new Student4(roll, name, age, course, marks));
        System.out.println("Student added successfully!");
    }

    // View all students
    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student4 s : studentList) {
            s.display();
        }
    }

    // Search student
    public static void searchStudent(int roll) {
        for (Student4 s : studentList) {
            if (s.rollno == roll) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Update marks
    public static void updateMarks(Scanner sc, int roll) {
        for (Student4 s : studentList) {
            if (s.rollno == roll) {
                System.out.print("Enter new marks: ");
                s.marks = sc.nextDouble();
                System.out.println("Marks updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete student
    public static void deleteStudent(int roll) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).rollno == roll) {
                studentList.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void main(String args[])
    {
           Scanner sc=new Scanner(System.in);
           while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    searchStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Roll Number to update: ");
                    updateMarks(sc, sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Roll Number to delete: ");
                    deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    
}
