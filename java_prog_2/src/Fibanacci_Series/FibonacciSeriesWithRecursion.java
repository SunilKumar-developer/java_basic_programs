package Fibanacci_Series;

import java.util.Scanner;

public class FibonacciSeriesWithRecursion {
    static int a=0,b=1,c,i;
    static void printFibonaccis(int count){
        if(count>0){
            c=b+a;
            a=b;
            b=c;
            System.out.print(" "+c);
            printFibonaccis(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Count");
        int count = scan.nextInt();
        System.out.print(a+" "+b);
        printFibonaccis(count-2);
    }
}
