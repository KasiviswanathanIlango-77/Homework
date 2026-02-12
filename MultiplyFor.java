import java.util.Scanner;
class MultiplyFor
{
	public static void main(String args[])
	{
		int i=1,n,a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		n=sc.nextInt();
		
		System.out.println("Multiplication Table for that number");
		for(i=1;i<=10;i++)
		{
			a=n*i;
			System.out.println(n +"*"+ i+"="+a);
			
		}
	}
}