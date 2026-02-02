class Swapxor
{
public static void main(String args[])
{
int a=5;
int b=7;
System.out.println("Before Swapping");
System.out.println("a is\t" +a);
System.out.println("b is\t" +b);
a=a^b;                   //0101^0111=0010   --------->2
b=a^b;                   //0010^0111=0101   ---------->5
a=a^b;                   //0010^0101=0111   ---------->7

System.out.println("After Swapping");
System.out.println("a is\t" +a);
System.out.println("b is\t" +b);
}
}