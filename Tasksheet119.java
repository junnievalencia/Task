import java.util.Scanner;

public class Tasksheet119 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (b != 0) ? (double) a / b : Double.NaN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.println("\nResults:");
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        
        double quotient = divide(num1, num2);
        if (Double.isNaN(quotient)) {
            System.out.println("Division: Division by zero is not allowed.");
        } else {
            System.out.println("Division: " + quotient);

        }
        
        scanner.close();
    }
}
