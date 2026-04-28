package Java11to20;

public class ReverseStringUsingForLoop11 {
    public static void main(String[] args) {
        String str = "XnovaQbrainx";
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println("Reverse String :"+reverse);
    }
}
