import java.util.Scanner;
class OnlineOrderStatus
{
public static void main(String args[])
{
char orderstatus;	
Scanner sc = new Scanner(System.in);
System.out.println("Enter the order status code:");
orderstatus=sc.next().charAt(0);
switch (orderstatus)
{
  case 'P':
  {
   
   System.out.println("Order Placed");
   break;
  } 
  case 'S':
  {
   
   System.out.println("Shipped");
   break;
  } 
  case 'D':
  {
  
   System.out.println("Delivered");
   break;
  } 
  case 'C':
  {
  
   System.out.println("Cancelled");
   break;
  } 
  default:
   System.out.println(" ");
   break;

}
}	
}	