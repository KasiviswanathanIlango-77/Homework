// Create a menu-driven program using array and functions to:
// 
// Add expense
// 
// View all expenses
// 
// Calculate total expense
// 
// Find highest expense
// 
// Exit


import java.util.Scanner;

class DailyExpense
{
	int findmax(int ar[])
	{
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
				max=ar[i];
		}
		return max;
	}
	public static void main(String args[])
	{
		
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Daily Expense Tracker");
		System.out.println("1.Add expense");
		System.out.println("2.View all expenses");
		System.out.println("3.Calculate total expense");
		System.out.println("4.Find highest expense");
		System.out.println("5.Exit");
		
		System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        DailyExpense d=new DailyExpense();
            switch (choice) {
				 case 1:
                    for(int i=0;i<ar.length;i++)
					{
						System.out.println("Enter the expense for day "+i);
						ar[i]=sc.nextInt();
					}
                    break;

                case 2:
				    System.out.println("All Expenses");
                    for(int i=0;i<ar.length;i++)
					{
						System.out.print(ar[i]+" ");
					}
                    break;

                case 3:
                    int total=0;
					for(int i=0;i<ar.length;i++)
		            {
		            	total=total+ar[i];
		            }
		            System.out.println("Total Expense="+total);
                    break;

                case 4:
                    int result=d.findmax(ar);
					System.out.println("Highest Expense="+result);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

         

        sc.close();
	}
}