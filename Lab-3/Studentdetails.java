import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    double cgpa;
    public Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }
}
public class Studentdetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            students[i] = new Student(rollNo, name, cgpa);
        }
        System.out.println("\nDetails of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Roll No - " + students[i].rollNo +", Name - " + students[i].name + ", CGPA - " + students[i].cgpa);
        }
        double lowest = students[0].cgpa;
        String lowestName = students[0].name;
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowest) {
                lowest = students[i].cgpa;
                lowestName = students[i].name;
            }
        }
        System.out.println("\nStudent with the lowest CGPA: " + lowestName);
        scanner.close();
    }
}