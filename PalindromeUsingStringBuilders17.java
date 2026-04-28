package Java11to20;

import java.util.Scanner;

public class PalindromeUsingStringBuilders17 {
    public static void main(String[] args) {
        System.out.println("Enter The String:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (ispalindrome(str)){
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }
    }
    private static boolean ispalindrome(String str){

        StringBuilder reversed = new StringBuilder(str.toLowerCase());
        reversed.reverse();
        return str.toLowerCase().equals(reversed.toString());
    }
}
