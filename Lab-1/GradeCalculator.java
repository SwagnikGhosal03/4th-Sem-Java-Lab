import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mark:");
        int mark = scanner.nextInt();
        String grade;
        if (mark >= 90 && mark <= 100) {
            grade = "O";
        } else if (mark >= 80 && mark < 90) {
            grade = "E";
        } else if (mark >= 70 && mark < 80) {
            grade = "A";
        } else if (mark >= 60 && mark < 70) {
            grade = "B";
        } else if (mark < 60) {
            grade = "C";
        } else {
            grade = "Invalid mark";
        }
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
