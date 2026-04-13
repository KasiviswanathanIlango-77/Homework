
package employeemanagement;



// Employee class
public class Employee8 {
    int id;
    String name;
    String department;

    // Constructor
    Employee8(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Display employee details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("------------------------");
    }
}

