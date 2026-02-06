import java.util.Scanner;
class SmartTrafficSignal
{
public static void main(String args[])
{	
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Signal Color:");
char color=sc.next().charAt(0);
switch (color)
{
  case 'R':
  {
   String alertmsg="STOP";
   System.out.println("R"+" -> "+alertmsg);
   break;
  } 
  case 'Y':
  {
   String alertmsg="READY";
   System.out.println("Y"+" -> "+alertmsg);
   break;
  } 
  case 'G':
  {
   String alertmsg="GO";
   System.out.println("G"+" -> "+alertmsg);
   break;
  } 
  default:
   System.out.println(" ");
   break;

}
}	
}	