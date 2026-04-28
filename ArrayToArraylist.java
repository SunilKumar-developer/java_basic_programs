import java.util.ArrayList;
import java.util.List;

public class ArrayToArraylist {
    public static void main(String[] args) {
        // Initialize the array
        int[] array = {2, 10, 3, 8, 5, 9};

        // Create an empty ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Manually add each element from the array to the ArrayList
        for (int num : array) {
            arrayList.add(num);
        }

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}
