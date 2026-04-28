
    public class EvenIndexedCharacters {
        public static void main(String[] args) {
            String input = "HelloWorld";
            printEvenIndexedCharacters(input);
        }

        public static void printEvenIndexedCharacters(String input) {
            for (int i = 0; i < input.length(); i += 2) {
                System.out.print(input.charAt(i) + " ");
            }
        }
    }


