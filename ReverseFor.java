import java.util.Scanner;
class ReverseFor
{
	public static void main(String args[])
	{
		int i=1,n,a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		n=sc.nextInt();
		a=n;
		System.out.println("The numbers from "+n+"to 1 are");
		for(i=1;i<=n;i++)
		{
			
			System.out.println(a);
			a-=1;
			
		}
	}
}