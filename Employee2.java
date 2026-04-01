
package advancedjavaapplication;


public class Employee2 {
    private int id;
    private String name;
    private String department;
    private double basicSalary;

    public Employee3(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Calculate Net Salary
    public double calculateNetSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double pf = 0.05 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    public void display() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Department: " + department +
                ", Basic Salary: " + basicSalary);
    }

}
