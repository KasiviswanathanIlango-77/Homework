// Student Management
// Create a  Java program using a Student class to perform:
// 
// 1.Add student details
// 
// 2.Update student name
// 
// 3.Display student details
// 
// 4.Exit

// Sample Input:

//1 
// Ravi
// 101
//2 
//3
//Sample Output:

//Student details saved Name: Ravi
//Roll No: 101
//Exited


import java.util.Scanner;
class StudentManagement
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		n=sc.nextInt();
		int a[]=new int[n];
		byte choice;
		int sn;
		String sname;
		do
        {
            System.out.println("menu");
            System.out.println("1.Add student details");
            System.out.println("2.Update student name");
            System.out.println("3.Display student details");
            System.out.println("4.Exit");
            System.out.println("Enter the Choice:");
            choice=sc.nextByte();
			
			switch(choice)
			{
			case 1:
			System.out.println("Enter the Student Roll No:");
			for(int i=0;i<n;i++)
			{
			sn=sc.nextInt();
			}
			break;
			
			case 2:
			System.out.println("Enter the Student Name:");
			for(int i=0;i<n;i++)
			{
			sname=sc.nextLine();
			}
			
			break;
			
			case 3:
			System.out.println("Displaying");
			for(int i=0;i<n;i++)
			{
			System.out.println(sname);
			System.out.println(sn);
			}
			break;
			
			case 4:
			System.out.println("Exit");
			break;
			}

        }while(choice!=4);
	}
}