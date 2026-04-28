package Fibanacci_Series;

import java.util.Scanner;

public class FibonacciSeriesWithoutRecursion {
    public static void main(String[] args) {
        int a = 0, b = 1, c, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Count");
        int count = scan.nextInt();
        System.out.print(a + " " + b);
        for (i = 2; i < count; i++) {
            c = b + a;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

}
