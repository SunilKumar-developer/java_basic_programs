    public class RemoveSpaces {
        public static void main(String[] args) {
            String input = "Xnovaq india private limited";
            String result = removeSpaces(input);
            System.out.println(result);
        }

        public static String removeSpaces(String input) {
            return input.replaceAll("\\s+", "");
        }
    }


