import java.util.Scanner;

class ExamScoreAnalyzer {

    static int[] scores = new int[100]; // array to store scores
    static int count = 0; // number of scores entered

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Exam Score Analyzer =====");
            System.out.println("1. Add Exam Score");
            System.out.println("2. Display All Scores");
            System.out.println("3. Count Pass Scores");
            System.out.println("4. Count Fail Scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addScore(scanner);
                    break;
                case 2:
                    displayScores();
                    break;
                case 3:
                    countPass();
                    break;
                case 4:
                    countFail();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }

    // Method to add exam score
    public static void addScore(Scanner scanner) {
        if (count < scores.length) {
            System.out.print("Enter exam score: ");
            int score = scanner.nextInt();
            scores[count] = score;
            count++;
            System.out.println("Score added successfully.");
        } else {
            System.out.println("Score list is full!");
        }
    }

    // Method to display all scores
    public static void displayScores() {
        if (count == 0) {
            System.out.println("No scores available.");
        } else {
            System.out.println("Exam Scores:");
            for (int i = 0; i < count; i++) {
                System.out.println("Score " + (i + 1) + ": " + scores[i]);
            }
        }
    }

    // Method to count pass scores (>=50)
    public static void countPass() {
        int passCount = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= 50) {
                passCount++;
            }
        }
        System.out.println("Number of passing scores: " + passCount);
    }

    // Method to count fail scores (<50)
    public static void countFail() {
        int failCount = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] < 50) {
                failCount++;
            }
        }
        System.out.println("Number of failing scores: " + failCount);
    }
}