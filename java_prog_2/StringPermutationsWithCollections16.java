package Java11to20;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsWithCollections16 {
    public static List<String> getPermutations(String str) {
        List<String> result = new ArrayList<>();
        // Convert string to character array and start the recursive process
        permute(str.toCharArray(), 0, result);
        return result;
    }

    // Helper function to generate permutations recursively
    private static void permute(char[] str, int left, List<String> result) {
        // If left index equals the length of the string, we've found a permutation
        if (left == str.length) {
            result.add(new String(str));  // Add permutation to the result list
        } else {
            // Loop through the string and swap characters
            for (int i = left; i < str.length; i++) {
                // Swap the characters at indices 'left' and 'i'
                swap(str, left, i);
                // Recur for the next part of the string
                permute(str, left + 1, result);
                // Backtrack: undo the swap to restore the string
                swap(str, left, i);
            }
        }
    }

    // Helper function to swap characters at indices i and j
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        String inputString = "ABC";

        // Call the method to get all permutations of the string
        List<String> permutations = getPermutations(inputString);

        // Print all permutations
        System.out.println("All permutations of the string:");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
