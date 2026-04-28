
    public class MoveZerosToFront {
        public static void main(String[] args) {
            String input = "302005007934";
            String result = moveZerosToFront(input);
            System.out.println(result);
        }

        public static String moveZerosToFront(String input) {
            StringBuilder zeros = new StringBuilder();
            StringBuilder nonZeros = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (c == '0') {
                    zeros.append(c);
                } else {
                    nonZeros.append(c);
                }
            }

            return zeros.append(nonZeros).toString();
        }
    }


