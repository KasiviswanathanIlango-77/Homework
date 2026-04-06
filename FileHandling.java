
package filehandling;
import java.io.*;
import java.util.Scanner;
public class FileHandling {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String fileName = "student.txt";
        int choice;
        do
        {
            System.out.println("-----File Management System-----");
            System.out.println("1.Write data");
            System.out.println("2.Read data");
            System.out.println("3.Append data");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                   try
                   {
                   FileWriter fw=new FileWriter(fileName);
                       System.out.println("Enter data to write:");
                       String data=sc.nextLine();
                       fw.write(data);
                      
                       System.out.println("Data Written Successfully(overwritten).");
                        fw.close();
                       }
                     catch(IOException e )
                        {
                             System.out.println("Error Writing File.");
                         }
                break;
                case 2:
                    try {
                        File file = new File(fileName);

                        if (!file.exists()) {
                            System.out.println("File does not exist.");
                            break;
                        }

                        FileReader fr = new FileReader(file);
                        int ch;

                        System.out.println("\n--- File Content ---");
                        while ((ch = fr.read()) != -1) {
                            System.out.print((char) ch);
                        }
                        fr.close();

                        System.out.println("\n--- End of File ---");

                    } catch (IOException e) {
                        System.out.println("Error reading file.");
                    }
         
                break;
                case 3:
                     try {
                        FileWriter fw = new FileWriter(fileName, true);
                        System.out.println("Enter data to append:");
                        String data = sc.nextLine();

                        fw.write("\n" + data);
                       

                        System.out.println("Data appended successfully.");
                         fw.close();
                    } catch (IOException e) {
                        System.out.println("Error appending file.");
                    }
         
                break;
                case 4:
                    System.out.println("Exiting Program...");
                    break;
               default:
                   System.out.println("Invalid Choice. Try again");
            }  
        }while(choice!=4);
        sc.close();
    }
    
}
