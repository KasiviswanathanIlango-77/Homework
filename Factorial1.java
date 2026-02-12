import java.util.Scanner;
class Factorial1
{
	public static void main(String args[])
	{
		int a=1,n,i=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			a=a*i;
			
		}
		System.out.print("factorial is\t"+a);
	}
}