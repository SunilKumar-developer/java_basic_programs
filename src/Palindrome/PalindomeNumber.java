package Palindrome;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PalindomeNumber {
    public static void main(String[] args) {
        int r,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = scan.nextInt();
        scan.close();
        if(isPalindrome(number)){
            System.out.println(number+"is a palindrome");
        }else {
            System.out.println(number+"is a not palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int original = num;
        int reverse = 0;
        while (num!=0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num /=10;
        }
        return  original==reverse;
    }



}


