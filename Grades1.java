
class Grades1 {
    public static void main(String args[]) {
        // Moved inside main so the static method can access it
        int marks = 92;

        if ((marks >= 90) && (marks <= 100)) {
            System.out.println("Grade A");
        } 
        else if ((marks >= 75) && (marks < 90)) {
            System.out.println("Grade B");
        } 
        else if ((marks >= 50) && (marks <= 74)) {
            System.out.println("Grade C");
        } 
        else if (marks < 50 && marks >= 0) {
            System.out.println("Fail");
        } 
        else {
            System.out.println("Invalid Mark");
        }
    }
}		