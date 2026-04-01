
package setinterface;
import java.util.Scanner; 
import java.util.HashSet;
import java.util.Set;
public class StudentClubManagement {
    public static void main(String[] args) {
        Set<String> members=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Club Management System =====");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Search Member");
            System.out.println("4. Display All Members");
            System.out.println("5. Count Members");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter member name to add: ");
                    String addName = sc.nextLine();

                    if (members.add(addName)) {
                        System.out.println("Member added successfully.");
                    } else {
                        System.out.println("Member already exists!");
                    }
                    break;

                case 2:
                    System.out.print("Enter member name to remove: ");
                    String removeName = sc.nextLine();

                    if (members.remove(removeName)) {
                        System.out.println("Member removed successfully.");
                    } else {
                        System.out.println("Member not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter member name to search: ");
                    String searchName = sc.nextLine();

                    if (members.contains(searchName)) {
                        System.out.println("Member is present in the club.");
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Club Members ---");
                    if (members.isEmpty()) {
                        System.out.println("No members in the club.");
                    } else {
                        for (String member : members) {
                            System.out.println(member);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total members: " + members.size());
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
