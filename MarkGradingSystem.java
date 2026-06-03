
package advancedjavaapplication;

class OldMarkSystem {
    // The old system only knows how to calculate and return total marks
    public int getTotalMarks(int theoryMarks, int practicalMarks) {
        return theoryMarks + practicalMarks;
    }
}
class MarkToGradeAdapter implements NewGradingSystem {
    private OldMarkSystem oldSystem;

    // Constructor accepts the old system instance (Composition)
    public MarkToGradeAdapter(OldMarkSystem oldSystem) {
        this.oldSystem = oldSystem;
    }
@Override
    public String getGrade(int theoryMarks, int practicalMarks) {
        // Step 1: Use the old system to get the total marks
        int total = oldSystem.getTotalMarks(theoryMarks, practicalMarks);
        
        // Step 2: Convert the total marks into a grade format
        if (total >= 90) return "A";
        else if (total >= 80) return "B";
        else if (total >= 70) return "C";
        else if (total >= 60) return "D";
        else return "F";
    }
}


public class MarkGradingSystem {
    public static void main(String[] args) {
        // We have an instance of the old system
        OldMarkSystem oldSystem = new OldMarkSystem();
        
        // We wrap it using our Adapter so it behaves like the new system
        NewGradingSystem gradingSystem = new MarkToGradeAdapter(oldSystem);
        
        // Student marks: Theory = 45, Practical = 40 (Total = 85)
        int theory = 45;
        int practical = 40;
        
        // The client interacts purely with the new system interface
        String finalGrade = gradingSystem.getGrade(theory, practical);
        
        System.out.println("--- Student Result ---");
        System.out.println("Theory Marks: " + theory);
        System.out.println("Practical Marks: " + practical);
        System.out.println("Calculated Grade: " + finalGrade); // Output: B
    }
}
