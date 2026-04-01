
package advancedjavaapplication;
import java.util.ArrayList;
import java.util.Scanner;
public class PayrollManagement1 {
    static ArrayList<Employee3> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Payroll Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateSalary();
                    break;
                case 5:
                    calculateSalary();
                    break;
                case 6:
                    deleteEmployee();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }

    // Add Employee
    public static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        // Check unique ID
        for (Employee3 e : employees) {
            if (e.getId() == id) {
                System.out.println("Employee ID already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee3(id, name, dept, salary));
        System.out.println("Employee added successfully!");
    }

    // View Employees
    public static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee3 e : employees) {
            e.display();
        }
    }

    // Find Employee
    public static Employee3 findEmployee(int id) {
        for (Employee3 e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    // Search Employee
    public static void searchEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee3 e = findEmployee(id);

        if (e != null) {
            e.display();
        } else {
            System.out.println("Employee not found!");
        }
    }

    // Update Salary
    public static void updateSalary() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee3 e = findEmployee(id);

        if (e != null) {
            System.out.print("Enter New Basic Salary: ");
            double newSalary = sc.nextDouble();
            e.setBasicSalary(newSalary);
            System.out.println("Salary updated successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    // Calculate Net Salary
    public static void calculateSalary() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee3 e = findEmployee(id);

        if (e != null) {
            double netSalary = e.calculateNetSalary();
            System.out.println("Net Salary: " + netSalary);
        } else {
            System.out.println("Employee not found!");
        }
    }

    // Delete Employee
    public static void deleteEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee3 e = findEmployee(id);

        if (e != null) {
            employees.remove(e);
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }
}
