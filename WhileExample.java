import java.util.Scanner;
class WhileExample
{
	public static void main(String args[])
	{
		int a,n,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		System.out.println("Multiplication Table");
		while(i<=10)
		{
			a=n*i;
			System.out.println(a);
			i++;
		}
	}
}