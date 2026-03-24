
package advancedjavaapplication;
import java.util.Scanner;

   /*
    public static void main(String[] args) 
    {
         static string collegeName="Magizhchi Arts and Science College";
         static int studentCount=0;
         
         System.out.println("Enter Student 1 ID:");    
         System.out.println("Enter Student 1 Name:"); 
         System.out.println("Enter Tuition Fee:");   
         StudentFeeManagement sm=new StudentFeeManagement();
         final int admissionfee = 5000;
    
}
*/
public class StudentFeeManagement 
{
    
     int studentId;
    String studentName;
    double tuitionFee;

    // Static variables
    static String collegeName = "Magizhchi Arts and Science College";
    static int studentCount = 0;

    // Final variable
    final int ADMISSION_FEE = 5000;

    // Constructor
    StudentFeeManagement(int studentId, String studentName, double tuitionFee) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.tuitionFee = tuitionFee;
        studentCount++; // increment count when object is created
    }

    // Calculate total fee
    double calculateTotalFee() {
        return tuitionFee + ADMISSION_FEE;
    }
  /*  
   public double calculateTotalFee(int tuitionfee, int admissionfee){
   double totalfees=tuitionfee+admissionfee;
   return totalfees;
   }
*/
 void displayDetails() {
        System.out.println("\nCollege Name: " + collegeName);
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Fee: " + calculateTotalFee());
    }

    // Static method to display total student count
    static void displayStudentCount() {
        System.out.println("\nTotal Students: " + studentCount);
    }   
 public static void main(String[] args) {  
Scanner sc = new Scanner(System.in);

        // Input for Student 1
        System.out.print("Enter Student 1 ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student 1 Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Tuition Fee: ");
        double fee1 = sc.nextDouble();

        // Input for Student 2
        System.out.print("\nEnter Student 2 ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student 2 Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Tuition Fee: ");
        double fee2 = sc.nextDouble();

        // Create objects
        StudentFeeManagement s1 = new StudentFeeManagement(id1, name1, fee1);
        StudentFeeManagement s2 = new StudentFeeManagement(id2, name2, fee2);

        // Display details
        s1.displayDetails();
        s2.displayDetails();

        // Display total students
        StudentFeeManagement.displayStudentCount();

        sc.close();
 }
 }