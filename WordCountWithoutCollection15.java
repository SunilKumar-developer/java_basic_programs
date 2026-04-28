package Java11to20;
//In this program, To count the number of words in a string in Java,
// you can split the string by spaces (or other delimiters) and
// count the number of resulting substrings.
public class WordCountWithoutCollection15 {
    private static void countWords(String input){
        input = input.trim();
        String[] words = input.split("\\s");
        System.out.println("Number of words :"+words.length);
    }
    public static void main(String[] args) {
        String input = "XnovaQ India Private Limited";
        countWords(input);
    }
}

//public static void countWords(String inputString) {
//    inputString = inputString.trim();
//    String[] wordsArray = inputString.split("\\s+");

//    // Convert the array of words to a List
//    List<String> wordsList = new ArrayList<>();
//    for (String word : wordsArray) {
//        wordsList.add(word);
//    }
//    System.out.println("Number of words: " + wordsList.size());
//}
