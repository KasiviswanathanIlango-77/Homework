
package simplejavaprograms;


public class EmployeeManagement {
    public static void main(String[] args) {

        // Creating Employee object
        Employee emp = new Employee("Alice", 50000);

        // Creating Manager object
        Manager mgr = new Manager("Bob", 80000, "IT");

        // Calling displayInfo()
        System.out.println("Employee Details:");
        emp.displayInfo();

        System.out.println("\nManager Details:");
        mgr.displayInfo();
    }

}
