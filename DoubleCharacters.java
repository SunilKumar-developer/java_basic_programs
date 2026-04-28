
    public class DoubleCharacters {
        public static void main(String[] args) {
            String input = "JavaProgramming";
            String result = doubleEachCharacter(input);
            System.out.println(result);
        }

        public static String doubleEachCharacter(String input) {
            StringBuilder doubledString = new StringBuilder();
            for (char c : input.toCharArray()) {
                doubledString.append(c).append(c);
            }
            return doubledString.toString();
        }
    }


