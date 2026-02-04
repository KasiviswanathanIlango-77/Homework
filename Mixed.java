class Mixed
{
public static void main(String args[])	
{	
int a=10 , b=5 ,c=15 ;
int g=a+b;                  //	Addition operator
int d=c-b;                  //  Substraction operator	
int e=a*b;	                //  Multiplication operator
int f=c/b;	                //  Division operator
boolean q = (a<=b)||(5>10)||(c>a);
boolean r = (b<=a)&&(10>7)&&(c>a);
boolean s = !((b<=a)&&!(5>10));	
System.out.println(q);
System.out.println(r);
System.out.println(s);	
System.out.println("Addition = " +g);	
System.out.println("Substraction = " +d);	
System.out.println("Multiplication = " +e);	
System.out.println("Division = " +f);	
	
}	
}	