package PrimeNumberorNot;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = scan.nextInt();
        m = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + "is not a prime Number");
        } else {
            for (i = 2; i <= m; i++) {
                if (m % i == 0) {
                    System.out.println(number + "is not a prime Number");
                    flag = 1;
                    break;
                }
                if (flag == 0) {
                    System.out.println(number + number + "is a prime Number");
                    break;
                }
            }
        }

    }
}


