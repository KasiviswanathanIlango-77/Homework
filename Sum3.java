import java.util.Scanner;
class Sum3
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First value:");
		a=sc.nextInt();
		System.out.println("Enter the Second value:");
		b=sc.nextInt();
		c=a+b;
		System.out.print("Output:");
		System.out.print(c);
		sc.close();
	}
}