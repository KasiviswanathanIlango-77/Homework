import java.util.Scanner;

class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark: ");
        int mark = sc.nextInt();

        if (mark >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
