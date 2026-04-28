public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 4, 7, 8, 6};

        System.out.println("Non-repeating elements:");
        for (int i = 0; i < array.length; i++) {
            boolean isRepeated = false;

            // Check if the current element is repeated in the array
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isRepeated = true;
                    break;
                }
            }

            // If not repeated, print the element
            if (!isRepeated) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
