package studentsproject;

import java.sql.*;
import java.util.Scanner;

public class StudentJDBCMenu {
    // PostgreSQL Database Details

    static final String URL
            = "jdbc:postgresql://localhost:5432/studentdb";

    static final String USER = "postgres";
    static final String PASSWORD = "Anbukasi@97";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Load PostgreSQL Driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            int choice;

            do {

                System.out.println("\n===== STUDENT RECORD MENU =====");
                System.out.println("1. Insert");
                System.out.println("2. Display");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // INSERT
                    case 1:

                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        String insertQuery
                                = "INSERT INTO student(id, name, department, marks) VALUES (?, ?, ?, ?)";
                        PreparedStatement psInsert
                                = con.prepareStatement(insertQuery);

                        psInsert.setInt(1, id);
                        psInsert.setString(2, name);
                        psInsert.setString(3, dept);
                        psInsert.setInt(4, marks);

                        int rows = psInsert.executeUpdate();

                        if (rows > 0) {
                            System.out.println("Record Inserted Successfully!");
                        }

                        psInsert.close();
                        break;

                    // DISPLAY
                    case 2:

                        String selectQuery = "SELECT * FROM student";

                        Statement st = con.createStatement();

                        ResultSet rs = st.executeQuery(selectQuery);

                        System.out.println("\n--- Student Records ---");

                        while (rs.next()) {

                            System.out.println(
                                    rs.getInt("id") + " | "
                                    + rs.getString("name") + " | "
                                    + rs.getString("department") + " | "
                                    + rs.getInt("marks"));
                        }

                        rs.close();
                        st.close();

                        break;

                    // UPDATE
                    case 3:

                        System.out.print("Enter Student ID to Update: ");
                        int updateId = sc.nextInt();

                        System.out.print("Enter New Marks: ");
                        int newMarks = sc.nextInt();

                        String updateQuery
                                = "UPDATE student SET marks=? WHERE id=?";

                        PreparedStatement psUpdate
                                = con.prepareStatement(updateQuery);

                        psUpdate.setInt(1, newMarks);
                        psUpdate.setInt(2, updateId);

                        int updated = psUpdate.executeUpdate();

                        if (updated > 0) {
                            System.out.println("Record Updated Successfully!");
                        } else {
                            System.out.println("Record Not Found!");
                        }

                        psUpdate.close();

                        break;

                    // DELETE
                    case 4:

                        System.out.print("Enter Student ID to Delete: ");
                        int deleteId = sc.nextInt();

                        String deleteQuery
                                = "DELETE FROM student WHERE id=?";

                        PreparedStatement psDelete
                                = con.prepareStatement(deleteQuery);

                        psDelete.setInt(1, deleteId);

                        int deleted = psDelete.executeUpdate();

                        if (deleted > 0) {
                            System.out.println("Record Deleted Successfully!");
                        } else {
                            System.out.println("Record Not Found!");
                        }

                        psDelete.close();

                        break;

                    // EXIT
                    case 5:
                        System.out.println("Exiting Program...");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 5);

            // Close Connection
            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
