import java.util.HashMap;
import java.util.Map;

public class MaxOccurrence {
    public static void main(String[] args) {
        String sentence = "This is a test sentence and this test is just a test";


        String[] words = sentence.toLowerCase().split("\\s+");


        Map<String, Integer> wordCount = new HashMap<>();


        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        String maxWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        
        System.out.println("The word with the maximum occurrence is: " + maxWord);
        System.out.println("It occurs " + maxCount + " times.");
    }
}

