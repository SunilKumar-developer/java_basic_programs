package Java11to20;

public class ReverseWords12 {
    public static String reverseWordInString(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reverseWord).append(" ");
        }
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Xnovaq India Private Limited";
        System.out.println("The Original String is : "+input);
        String result = reverseWordInString(input);
        System.out.println("Reverse word is : "+result);
    }
}
