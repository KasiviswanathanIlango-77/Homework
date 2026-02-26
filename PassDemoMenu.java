import java.util.Scanner;

class Student {
    int marks;
}

class PassDemoMenu {

    
    void increaseMarks(int marks) {
        marks += 10;
        System.out.println("Inside method: " + marks);
    }

    
    void updateStudentMarks(Student s) {
        s.marks += 10;
        System.out.println("Inside method: " + s.marks);
    }

    
    void changeName(String name) {
        name = name + " Kumar";
        System.out.println("Inside method: " + name);
    }

    
    void modifyArray(int arr[]) {
        arr[0] = 99;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte choice;
        PassDemoMenu  pdm=new PassDemoMenu();
        do {
            System.out.println("MENU");
            System.out.println("1. Pass by Value – Increase Marks");
            System.out.println("2. Pass by Reference – Update Student Marks");
            System.out.println("3. Pass by Value – Change String");
            System.out.println("4. Pass by Reference – Modify Array");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextByte();

            switch (choice) {

                case 1:
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    System.out.println("Before method call: " + marks);
                    pdm.increaseMarks(marks);
                    System.out.println("After method call: " + marks);
                    break;

                case 2:
                    Student student = new Student();
                    System.out.print("Enter student marks: ");
                    student.marks = sc.nextInt();
                    System.out.println("Before method call: " + student.marks);
                    pdm.updateStudentMarks(student);
                    System.out.println("After method call: " + student.marks);
                    break;

                case 3:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Before method: " + name);
                    pdm.changeName(name);
                    System.out.println("After method: " + name);
                    break;

                case 4:
                    int arr[] = new int[3];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < 3; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.print("Before method: ");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    pdm.modifyArray(arr);
                    System.out.println("After method: ");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Program Exited Successfully");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}