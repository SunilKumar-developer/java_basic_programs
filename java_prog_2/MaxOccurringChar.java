public class MaxOccurringChar {
    public static void main(String[] args) {
        String str = "sample string example"; // Input string
        str = str.replaceAll("\\s", ""); // Remove spaces for clarity

        int[] frequency = new int[256]; // Array to store the frequency of each character
        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        // Find the character with the maximum frequency
        char maxChar = str.charAt(0);
        int maxFrequency = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                maxChar = (char) i;
            }
        }

        System.out.println("The maximum occurring character is: " + maxChar);
        System.out.println("It occurs " + maxFrequency + " times.");
    }
}
