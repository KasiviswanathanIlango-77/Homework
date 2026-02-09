import java.util.Scanner;

class SpotifyMusicAPP {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Spotify Music App");
        System.out.println("1. A R Rahman");
        System.out.println("2. Anirudh");
        System.out.println("3. Yuvan Shankar Raja");
        System.out.print("Enter the music director: ");

        String director = sc.nextLine();

        switch (director) {

            case "A R Rahman": {
                System.out.println("1. Melody Songs");
                System.out.println("2. Folk Songs");
                System.out.print("Enter your Choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Melody Songs List");
                    System.out.println("1. Ennodu Nee Irunthal");
                    System.out.println("2. Hosanna");
                } else if (choice == 2) {
                    System.out.println("Folk Songs List");
                    System.out.println("1. Nenjukkule");
                    System.out.println("2. Anbay");
                } else {
                    System.out.println("Invalid Music Type");
                    break;
                }

                System.out.print("Enter your Option: ");
                int option = sc.nextInt();
                if (option == 1 || option == 2) {
                    System.out.println("Now Playing...");
                } else {
                    System.out.println("Invalid Song Selection");
                }
                break;
            }

            case "Anirudh": {
                System.out.println("1. Melody Songs");
                System.out.println("2. Folk Songs");
                System.out.print("Enter your Choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Melody Songs List");
                    System.out.println("1. Amma Amma");
                    System.out.println("2. Enna Solla");
                } else if (choice == 2) {
                    System.out.println("Folk Songs List");
                    System.out.println("1. Kaavaala");
                    System.out.println("2. Hukum Thalaivar Alaparai");
                } else {
                    System.out.println("Invalid Music Type");
                    break;
                }

                System.out.print("Enter your Option: ");
                int option = sc.nextInt();
                if (option == 1 || option == 2) {
                    System.out.println("Now Playing...");
                } else {
                    System.out.println("Invalid Song Selection");
                }
                break;
            }

            case "Yuvan Shankar Raja": {
                System.out.println("1. Melody Songs");
                System.out.println("2. Folk Songs");
                System.out.print("Enter your Choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Melody Songs List");
                    System.out.println("1. En Kadhal Solla");
                    System.out.println("2. En Iniya Pon Nilave");
                } else if (choice == 2) {
                    System.out.println("Folk Songs List");
                    System.out.println("1. Ek Tho Dheen");
                    System.out.println("2. Matta");
                } else {
                    System.out.println("Invalid Music Type");
                    break;
                }

                System.out.print("Enter your Option: ");
                int option = sc.nextInt();
                if (option == 1 || option == 2) {
                    System.out.println("Now Playing...");
                } else {
                    System.out.println("Invalid Song Selection");
                }
                break;
            }

            default:
                System.out.println("Invalid Music Director");
        }

        sc.close();
    }
}
