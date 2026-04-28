package Java11to20;

public class ReverseStringUsingStringBuilders11 {
    public static void main(String[] args) {
        String str = "XnovaQbrains";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse String is :"+reverse);
    }
}
