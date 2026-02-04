class Logical1
{
public static void main(String args[])	
{	
int a=10 , b=5 ;
boolean q = (a<=b)||(5>10);
boolean r = (b<=a)&&(10>7);
boolean s = !((b<=a)&&!(5>10));	
System.out.println(q);
System.out.println(r);
System.out.println(s);
}	
}	