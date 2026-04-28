package PrimeNumberorNot;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scan.nextInt();
        //Scanner.close;
        if (isPrime(n)) {
            System.out.println(n + "is a prime number");
        } else {
            System.out.println(n + "is not a prime number");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }
        }

        return false;
    }
}

