import java.util.Scanner;

public class Tasksheet116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word to check if it's a palindrome: ");
        String input = scanner.nextLine(); 

        String reversedString = new StringBuilder(input).reverse().toString();

        if (input.equals(reversedString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    
        scanner.close();
    }
}
