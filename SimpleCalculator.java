class SimpleCalculator
{
public static void main(String args[])	
{	
int num1=10;	
int num2=20;	
char ch1='+';
char ch2='-';
char ch3='*';
char ch4='/';
if ((ch1=='+')&&(ch2=='-')&&(ch3=='*')&&(ch4=='/'))
{
System.out.println("addition = "+(num1+num2));
System.out.println("substraction = "+(num2-num1));

System.out.println("multiplication = "+(num1*num2));

System.out.println("division = "+(num2/num1));
}
else
{
System.out.println("Invalid Operation");
}	
}	
}	