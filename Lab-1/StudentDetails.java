import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your roll number:");
        String rollNo = scanner.nextLine();
        System.out.println("Enter your section:");
        String section = scanner.nextLine();
        System.out.println("Enter your branch:");
        String branch = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
        scanner.close();
    }
}
