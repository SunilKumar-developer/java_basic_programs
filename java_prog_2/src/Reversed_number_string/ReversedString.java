package Reversed_number_string;
import java.lang.String;
import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--){
            reversed +=str.charAt(i);
        }
        System.out.println("Reversed String:"+reversed);
        scan.close();
    }
}
