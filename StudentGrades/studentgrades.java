package StudentGrades;
import java.util.Random;
public class studentgrades {
    public class StudentGrades {
    public static void main(String[] args) {
        int[] scores = new int[10];
        Random random = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = random.nextInt(60) + 40; // random ค่าในช่วง [40, 99]
            System.out.println("Score of student " + (i + 1) + " is " + scores[i]);
        }
        System.out.println("\nCalculation Grade..");
        for (int i = 0; i < scores.length; i++) {
            String grade = calculateGrade(scores[i]);
            System.out.println("Grade of student " + (i + 1) + " is " + grade);
        }
    }
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B+";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C+";
        } else if (score >= 50) {
            return "C";
        } else if (score >= 45) {
            return "D+";
        } else if (score >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}
}