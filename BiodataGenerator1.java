
package filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class BiodataGenerator1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            FileWriter fw=new FileWriter("Biodata1.txt");
            System.out.println("***Enter Details for Biodata***");
             // Personal Details
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            String age = sc.nextLine();
            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();
            System.out.print("Enter Date of Birth (DD-MM-YYYY): ");
            String dob = sc.nextLine();
            System.out.print("Enter Blood Group: ");
            String bloodGroup = sc.nextLine();

            //  Educational Details
            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();
            System.out.print("Enter College Name: ");
            String college = sc.nextLine();
            System.out.print("Enter Percentage/CGPA: ");
            String cgpa = sc.nextLine();

            //  Professional Details
            System.out.print("Enter Skills: ");
            String skills = sc.nextLine();
            System.out.print("Enter Experience (in years): ");
            String experience = sc.nextLine();

            //  Contact Details
            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();
            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            
            // Family Details
            System.out.print("Enter Father's Name: ");
            String father = sc.nextLine();
            System.out.print("Enter Mother's Name: ");
            String mother = sc.nextLine();
            
            fw.write("===BIO DATA===");
            fw.write("👤 Personal Details\n");
            fw.write(" Name         : " + name + "\n");
            fw.write(" Age          : " + age + "\n");
            fw.write(" Gender       : " + gender + "\n");
            fw.write(" DOB          : " + dob + "\n");
            fw.write(" Blood Group  : " + bloodGroup + "\n\n");

            fw.write("🎓 Education\n");
            fw.write(" Qualification: " + qualification + "\n");
            fw.write(" College      : " + college + "\n");
            fw.write(" CGPA         : " + cgpa + "\n\n");

            fw.write("💼 Professional Details\n");
            fw.write(" Skills       : " + skills + "\n");
            fw.write(" Experience   : " + experience + " Year(s)\n\n");

            fw.write("📞 Contact\n");
            fw.write(" Phone        : " + phone + "\n");
            fw.write(" Email        : " + email + "\n");
            fw.write(" Address      : " + address + "\n\n");

            fw.write("👨‍👩‍👧 Family\n");
            fw.write(" Father Name  : " + father + "\n");
            fw.write(" Mother Name  : " + mother + "\n");
           fw.write("================================\n");

            // Close resources
            fw.close();
            System.out.println("\n Success! Bio Data has been saved to 'Biodata1.txt'.");

        }
        catch(IOException e)
        {
            System.out.println("An error occurred while writing to this file.");
            e.printStackTrace();
        }
        sc.close();
    }
}
