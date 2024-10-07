//Reverse a number
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Convert the number to a string
        String numberString = Integer.toString(number);
        
        // Reverse the string
        String reversedString = new StringBuilder(numberString).reverse().toString();
        
        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedString);
        
        // Output the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
        
        scanner.close();
    }
}
