import java.util.ArrayList;

public class FirstAndLastElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Check if the list is not empty
        if (!list.isEmpty()) {
            // Get the first and last element
            int firstElement = list.get(0);
            int lastElement = list.get(list.size() - 1);

            // Print the results
            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
