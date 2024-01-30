class SubtractOperation {
    int subtract(int a, int b) {
        return a - b;
    }
    double subtract(double a, double b, double c) {
        return a - b - c;
    }
    int subtract(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result -= num;
        }
        return result;
    }
}
public class SubstractDrv {
    public static void main(String[] args) {
        SubtractOperation subtractor = new SubtractOperation();
        int result1 = subtractor.subtract(10, 5);
        System.out.println("Result 1: " + result1);
        double result2 = subtractor.subtract(15.5, 7.2, 3.8);
        System.out.println("Result 2: " + result2);
        int[] numbers = {7, 3, 1};
        int result3 = subtractor.subtract(numbers);
        System.out.println("Result 3: " + result3);
    }
}




