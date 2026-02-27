import java.util.Scanner;
class Dsa1
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		n=sc.nextInt();
		int ids[]=new int[n];
		byte choice;
		do
		{
			System.out.println("Menu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");
			System.out.println("Enter Choice:");
			choice=sc.nextByte();
			switch(choice)
			{
				case 1:
				for(int i=0;i<n;i++)
				{	
				System.out.println("Enter employee ID:");
				ids[i]=sc.nextInt();
				}
				break;
				case 2:
				int pos=2
				System.out.println("Enter employee ID to remove:");
				
		
		        for(int i=0;i<pos-1;i++)
		        {
		        	ids[i]=ids[i];
		        }
				break;
				for(int i=pos-1;i<br.length;i++)
		        {
		        	ids[i]=ids[i+1];
		        }
		
				case 3:
				for(int i=0;i<n;i++)
				{
					System.out.print(ids[i]+" ");
				}
				break;
				case 4:
				System.out.println("Exit");
				break;
			}
		}while(choice!=4);
	}
}