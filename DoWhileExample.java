import java.util.Scanner;
class DoWhileExample {
     public static void main(String[] args) {
        int i = 1,n;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
        do {
            
            
            System.out.println(i);
            if (i > n) {
                break;   // exit loop
            }
			i++;

        } while (true);   // no real condition
    }
}
