import java.util.Scanner;
class BankAccountSystem {
    
    public static void main(String[] args) {
        int balance=1000;
        Scanner sc=new Scanner(System.in);
        byte choice;
        do
        {
            System.out.println("menu");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display balance");
            System.out.println("4.Exit");
            System.out.println("Enter the Choice:");
            choice=sc.nextByte();
			switch(choice)
			{
			case 1:
			System.out.println("Enter the amount to be deposited:");
			int da=sc.nextInt();
			balance=balance+da;
			break;
			
			case 2:
			System.out.println("Enter the amount to be withdrawn:");
			int wa=sc.nextInt();
			balance=balance-wa;
			break;
			
			case 3:
			System.out.println("Balance is "+balance);
			break;
			
			case 4:
			System.out.println("Exit");
			break;
			}

        }while(choice!=4);
        
    }
}