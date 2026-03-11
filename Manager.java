
package simplejavaprograms;

 class Manager Extends Employee{
    String department;

    // Constructor
    Manager(String name, double salary, String department) {
        super(name, salary);   // calling parent constructor
        this.department = department;
    }

    // Overriding displayInfo()
    // @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
