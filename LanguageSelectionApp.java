import java.util.Scanner;
class LanguageSelectionApp
{
public static void main(String args[])
{
byte num;	
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
num = sc.nextByte();
switch (num)
{
  case 1:
  {
   
   System.out.println("Tamil");
   break;
  } 
  case 2:
  {
   
   System.out.println("English");
   break;
  } 
  case 3:
  {
  
   System.out.println("Hindi");
   break;
  } 
  case 4:
  {
  
   System.out.println("Malayalam");
   break;
  } 
  default:
   System.out.println(" ");
   break;

}
}	
}	