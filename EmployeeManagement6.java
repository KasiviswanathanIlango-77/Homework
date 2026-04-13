/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagement;

import java.util.Scanner;


public class EmployeeManagement6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee8[] employees = new Employee8[100]; // Array storage
        int count = 0; // Number of employees

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add Employee
                    if (count < 100) {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // consume newline

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        employees[count] = new Employee8(id, name, dept);
                        count++;

                        System.out.println("Employee Added Successfully!");
                    } else {
                        System.out.println("Employee list is full!");
                    }
                    break;

                case 2:
                    // View All Employees
                    if (count == 0) {
                        System.out.println("No employees to display.");
                    } else {
                        System.out.println("\nEmployee List:");
                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }
                    break;

                case 3:
                    // Search Employee by ID
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].id == searchId) {
                            System.out.println("Employee Found:");
                            employees[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

}
