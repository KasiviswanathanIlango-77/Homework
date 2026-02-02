class Swap
{
public static void main(String args[])
{
int a=180;
int b=210;
System.out.println("Before Swapping");
System.out.println("a is\t" +a);
System.out.println("b is\t" +b);
a=a+b;
b=a-b;
a=a-b;

System.out.println("After Swapping");
System.out.println("a is\t" +a);
System.out.println("b is\t" +b);
}
}