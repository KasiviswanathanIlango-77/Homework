import java.util.Scanner;
class forloop
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Nth Value:");
		n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
	}
}