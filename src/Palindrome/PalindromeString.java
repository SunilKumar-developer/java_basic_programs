package Palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is a not a palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        //str = str.toLowerCase();
        int start =  0;
        int end = str.length()-1;
        while (start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
