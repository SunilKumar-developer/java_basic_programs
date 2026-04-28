package Reversed_number_string;

import java.util.Scanner;
public class ReversingNumber {

        public static void main(String[] args) {
            // Create a scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for input
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Call the reverseNumber method to reverse the number
            int reversedNum = reverseNumber(num);

            // Print the reversed number
            System.out.println("Reversed Number: " + reversedNum);

            // Close the scanner
            scanner.close();
        }

        // Method to reverse the digits of a number
        public static int reverseNumber(int num) {
            int reversed = 0;

            // While the number is greater than 0, extract digits
            while (num != 0) {
                int digit = num % 10;  // Extract the last digit
                reversed = reversed * 10 + digit;  // Append it to the reversed number
                num /= 10;  // Remove the last digit from the number
            }

            return reversed;
        }
    }
