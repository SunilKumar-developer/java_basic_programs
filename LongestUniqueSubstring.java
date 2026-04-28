
    import java.util.HashMap;

    public class LongestUniqueSubstring {

        public static String findLongestUniqueSubstring(String input) {
            if (input == null || input.isEmpty()) {
                return "";
            }

            int maxLength = 0;
            int start = 0;
            int longestStart = 0;
            HashMap<Character, Integer> charIndexMap = new HashMap<>();

            for (int end = 0; end < input.length(); end++) {
                char currentChar = input.charAt(end);

                // If character is already in the map, update the start position
                if (charIndexMap.containsKey(currentChar)) {
                    start = Math.max(start, charIndexMap.get(currentChar) + 1);
                }

                // Update the character's index in the map
                charIndexMap.put(currentChar, end);

                // Update max length and starting index of the longest substring
                if (end - start + 1 > maxLength) {
                    maxLength = end - start + 1;
                    longestStart = start;
                }
            }

            // Return the longest unique substring
            return input.substring(longestStart, longestStart + maxLength);
        }

        public static void main(String[] args) {
            String input = "Fullstack developer";
            String result = findLongestUniqueSubstring(input);
            System.out.println("The longest substring without repeating characters is: " + result);
        }
    }


