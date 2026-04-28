    public class CharacterCompression {
        public static void main(String[] args) {
            String input = "aabbcccdd";
            String result = compressString(input);
            System.out.println(result);
        }

        public static String compressString(String input) {
            StringBuilder compressed = new StringBuilder();
            int count = 1;

            for (int i = 0; i < input.length(); i++) {
                if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                    count++;
                } else {
                    compressed.append(input.charAt(i)).append(count);
                    count = 1;
                }
            }

            return compressed.toString();
        }
    }


