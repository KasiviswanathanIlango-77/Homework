
import java.util.Scanner;
class SmartCity {
    public static void main(String[] args) {
        System.out.println("SMART CITY UTILITY MENU");
        System.out.println("1. Electricity Bill");
        System.out.println("2. Water Bill");
        System.out.println("3. Internet Plan");
        System.out.println("4. Exit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        int choice = sc.nextInt();
        int option,price;
        if (choice==1)
        {
          System.out.println("Electricity Bill"); 
          System.out.println("Enter the Power Unit that have been used:");
           int unit=sc.nextInt();
           if(unit<=100)
           {
               price=2*unit;
               System.out.println("Price is Rs"+price);
           }
           else if((unit>100)&&(unit<=300))
           {
               price=3*unit;
               System.out.println("Price is Rs"+price);
           }
           else if(unit>300)
           {
               price=5*unit;
               System.out.println("Price is Rs"+price);
           }
           else
           {
               System.out.println("EB Bill will not be generated. As the Unit is invalid.");
           }
        }
        else if(choice==2)
        {
            System.out.println("Water Bill");
            System.out.println("1.Apartment");
            System.out.println("2.Individual House");
            System.out.println("Enter the House Type:");
            option = sc.nextInt();
            if(option==1)
            {
                System.out.println("Apartment");
                System.out.println("Monthly charge is Rs300");
            }
            else if(option==2)
            {
                System.out.println("Individual House");
                System.out.println("Monthly charge is Rs500");
            }
            else
            {
                System.out.println("House Type is invalid");
            }
        }
        else if(choice==3)
        {
            System.out.println("Internet Plan");
            System.out.println("1. Basic Plan");
            System.out.println("2. Standard Plan");
            System.out.println("3. Premium Plan");
            System.out.println("Enter plan choice:");
            option = sc.nextInt();
            if(option==1)
            {
                System.out.println("Basic Plan");
                System.out.println("Monthly charge is Rs399");
            }
            else if(option==2)
            {
                System.out.println("Standard Plan");
                System.out.println("Monthly charge is Rs699");
            }
            else if(option==3)
            {
                System.out.println("Premium Plan");
                System.out.println("Monthly charge is Rs999");
            }
            else
            {
                System.out.println("Plan Type is invalid");
            }
        }
        else
        {
        System.out.println("Exit");
        System.out.println("Thank you for using Smart City Utility System");
        return;
        }
    }
}