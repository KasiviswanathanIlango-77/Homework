Swap Two Numbers Using a Single Statement

public class SwapNumbersEx5 
{
   public static void main(String[] args) 
   {
       int a=5;
       int b=4;
       
       System.out.println("Before Swap the Value Of A & B: "+a+" "+b);
	   
	   b=a+b -(a=b);
       
       System.out.println("After Swap the Value Of A & B: "+a+" "+b);
   }
}