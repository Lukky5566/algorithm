import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your score: ");
        int score = scanner.nextInt();

        String grade;
        if (score >= 80) {
            grade = "A";
        } else if (score >= 75) {
            grade = "B+";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 65) {
            grade = "C+";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 55) {
            grade = "D+";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Your grade is " + grade);

        scanner.close();
    }
}