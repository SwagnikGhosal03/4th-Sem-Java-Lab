import java.util.Scanner;
public class Rectangle6 {
    double length;
    double breadth;
    public Rectangle6() {
        this.length = 0;
        this.breadth = 0;
    }
    public Rectangle6(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return this.length * this.breadth;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        Rectangle6 rectangle = new Rectangle6(length, breadth);
        System.out.println("The area of the rectangle is: " + rectangle.area());
        scanner.close();
    }
}

