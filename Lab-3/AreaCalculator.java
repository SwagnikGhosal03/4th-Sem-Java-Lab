import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose a shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    areaOfCircle(radius);
                    break;
                case 2:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    areaOfTriangle(base, height);
                    break;
                case 3:
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    areaOfSquare(side);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
    public static void areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public static void areaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }
    public static void areaOfSquare(double side) {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }
    
}
