
    public class SeparateLetters {
        public static void main(String[] args) {
            String input = "aBACbcEDed";
            String result = separateAndSortLetters(input);
            System.out.println(result);
        }

        public static String separateAndSortLetters(String input) {
            StringBuilder lowercase = new StringBuilder();
            StringBuilder uppercase = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lowercase.append(c);
                } else if (Character.isUpperCase(c)) {
                    uppercase.append(c);
                }
            }

            char[] lowerArray = lowercase.toString().toCharArray();
            char[] upperArray = uppercase.toString().toCharArray();
            java.util.Arrays.sort(lowerArray);
            java.util.Arrays.sort(upperArray);

            return new String(lowerArray) + " " + new String(upperArray);
        }
    }

