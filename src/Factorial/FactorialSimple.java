package Factorial;

public class FactorialSimple {
    public static void main(String[] args) {
        int i,fact=1;
        int num = 6;
        for (i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorila of"+num+"is"+fact);
    }

}
