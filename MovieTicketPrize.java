import java.util.Scanner;
class MovieTicketPrize
{
public static void main(String args[])
{
int age;	
Scanner sc = new Scanner(System.in);
System.out.print("Enter the customer age:");
age=sc.nextInt();
int price;
if (age < 12)
{
	price=80;
	System.out.println("The Price is Rs. "+price);
}	
else if ((age >= 12)&&(age <= 59))
{
	price=150;
	System.out.println("The Price is Rs. "+price);
}	
else
{
	price=100;
	System.out.println("The Price is Rs. "+price);
}
sc.close();
}
}	