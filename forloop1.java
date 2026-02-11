import java.util.Scanner;
class forloop1
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Nth Value:");
		n=sc.nextInt();
		System.out.println("Even Numbers");
		for(int i=0; i<=n; i++)
		{
			if(i%2==0)
				
			System.out.println(i);
		}
	}
}