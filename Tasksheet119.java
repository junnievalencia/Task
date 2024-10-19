import java.util.Scanner;

public class Tasksheet119 {

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return (b != 0) ? a / b : Float.NaN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();
        
        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();
        
        System.out.println("\nResults:");
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        
        System.out.println(Float.isNaN(divide(num1, num2)) ? "Division: Division by zero is not allowed." : "Division: " + divide(num1, num2));
        
        scanner.close();
    }
}
