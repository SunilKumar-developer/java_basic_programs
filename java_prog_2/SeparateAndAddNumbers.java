public class SeparateAndAddNumbers {
    public static void main(String[] args) {
        String[] array = {"a", "b", "1", "c", "4", "2", "#", "5", "d"};

        int sum = 0; // Initialize sum to 0

        for (String element : array) {
            // Check if the element is a number
            if (element.matches("\\d+")) {
                sum += Integer.parseInt(element); // Convert to integer and add to sum
            }
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
