package Java11to20;

import java.util.HashMap;

public class DuplicateCharactersUsingMap13 {
    public static void findDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
        }

        System.out.println("Duplicate characters in the string:");
        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) > 1) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "programming";
        findDuplicateCharacters(inputString);
    }
}
