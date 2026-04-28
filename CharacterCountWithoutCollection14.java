package Java11to20;

public class CharacterCountWithoutCollection14 {
    private static void countCharacter(String input) {
        int[] charCount = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCount[currentChar]++;
        }
        for (int i = 0; i < charCount.length; i++) {
            if(charCount[i]>0){
                System.out.println((char)i+": "+charCount[i]);
            }
        }
    }
    public static void main(String[] args) {
        String input = "XnovaQ India Private Limited";
        countCharacter(input);
    }
}
