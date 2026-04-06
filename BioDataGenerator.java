
package filehandling;


import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class BioDataGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Initialize FileWriter (creates biodata.txt if it doesn't exist)
            FileWriter writer = new FileWriter("Biodata.txt");

            System.out.println("--- Enter Details for Bio Data ---");

            // 👤 Personal Details
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            String age = sc.nextLine();
            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();
            System.out.print("Enter Date of Birth (DD-MM-YYYY): ");
            String dob = sc.nextLine();
            System.out.print("Enter Blood Group: ");
            String bloodGroup = sc.nextLine();

            // 🎓 Educational Details
            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();
            System.out.print("Enter College Name: ");
            String college = sc.nextLine();
            System.out.print("Enter Percentage/CGPA: ");
            String cgpa = sc.nextLine();

            // 💼 Professional Details
            System.out.print("Enter Skills: ");
            String skills = sc.nextLine();
            System.out.print("Enter Experience (in years): ");
            String experience = sc.nextLine();

            // 📞 Contact Details
            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();
            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            // 👨‍👩‍👧 Family Details
            System.out.print("Enter Father's Name: ");
            String father = sc.nextLine();
            System.out.print("Enter Mother's Name: ");
            String mother = sc.nextLine();

            // Writing to File with Formatting
            writer.write("=========== BIO DATA ===========\n");
            writer.write("👤 Personal Details\n");
            writer.write(" Name         : " + name + "\n");
            writer.write(" Age          : " + age + "\n");
            writer.write(" Gender       : " + gender + "\n");
            writer.write(" DOB          : " + dob + "\n");
            writer.write(" Blood Group  : " + bloodGroup + "\n\n");

            writer.write("🎓 Education\n");
            writer.write(" Qualification: " + qualification + "\n");
            writer.write(" College      : " + college + "\n");
            writer.write(" CGPA         : " + cgpa + "\n\n");

            writer.write("💼 Professional Details\n");
            writer.write(" Skills       : " + skills + "\n");
            writer.write(" Experience   : " + experience + " Year(s)\n\n");

            writer.write("📞 Contact\n");
            writer.write(" Phone        : " + phone + "\n");
            writer.write(" Email        : " + email + "\n");
            writer.write(" Address      : " + address + "\n\n");

            writer.write("👨‍👩‍👧 Family\n");
            writer.write(" Father Name  : " + father + "\n");
            writer.write(" Mother Name  : " + mother + "\n");
            writer.write("================================\n");

            // Close resources
            writer.close();
            System.out.println("\n Success! Bio Data has been saved to 'Biodata.txt'.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}