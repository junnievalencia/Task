public class Tasksheet117 {
    public static void main(String[] args) {
       
        int number1 = 315;  
        int number2 = 325;  
        int number3 = 345;  

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal.");
        } else {
            
            int largest = number1;

            if (number2 > largest) {
                largest = number2;
            }

            if (number3 > largest) {
                largest = number3;
            }

            System.out.println("The largest number is: " + largest);
        }
    }
}
