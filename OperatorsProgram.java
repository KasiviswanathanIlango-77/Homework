import java.util.Scanner;

class OperatorsProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Value: ");
		
        int a = sc.nextInt();
        System.out.print("Enter B Value: ");  
        int b = sc.nextInt();
		int s,p,q,r;
        s= a+b;
		p= a*b;
		q= a/b;
		r= a%b;
        System.out.println("Sum = " +s);
        System.out.println("Product = " +p);
        System.out.println("Quotient = " +q);
        System.out.println("Remainder = " +r);		
        sc.close();
    }
}