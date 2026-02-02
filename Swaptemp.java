class Swaptemp
{
public static void main(String args[])
{
byte a=10;
byte b=20;
System.out.println("Before Swapping");
System.out.println("a is\t" +a);
System.out.println("b is\t" +b);
byte temp=a;
a=b;
b=temp;
System.out.println("After Swapping");
System.out.println("a is\t" +a);
System.out.println("b is\t" +b);
}
}