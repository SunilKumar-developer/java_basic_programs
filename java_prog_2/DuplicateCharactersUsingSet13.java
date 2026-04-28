package Java11to20;

import java.util.HashSet;

public class DuplicateCharactersUsingSet13 {
    public static void findDuplicateCharacters(String str) {
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (seen.contains(currentChar)) {
                duplicates.add(currentChar);
            } else {
                seen.add(currentChar);
            }
        }
        System.out.println("Duplicate characters in the string:");
        for (char ch : duplicates) {
            System.out.print(ch + " ");
        }
    }

    public static void main(String[] args) {
        String inputString = "programming";
        findDuplicateCharacters(inputString);
    }
}
