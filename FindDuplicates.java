import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2); // Duplicate element
        list.add(3); // Duplicate element
        list.add(5);
        System.out.println("Original arraylist" + list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Without duplicates element:" + set);
    }
    }


//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class FindDuplicates {
//    public static void main(String[] args) {
//        // Step 1: Declare and initialize a List with some duplicate elements
//        List<String> list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Orange");
//        list.add("Apple");
//        list.add("Grapes");
//        list.add("Banana");
//
//        // Step 2: Create a Set to keep track of elements seen so far
//        Set<String> seenElements = new HashSet<>();
//        // Create a Set to store duplicates
//        Set<String> duplicates = new HashSet<>();
//
//        // Step 3: Use a simple for loop to iterate over the List and find duplicates
//        for (int i = 0; i < list.size(); i++) {
//            String element = list.get(i);  // Get the element at index i
//            if (!seenElements.contains(element)) {
//                seenElements.add(element);  // If it's not in seenElements, add it
//            } else {
//                duplicates.add(element);  // If it already exists, it's a duplicate
//            }
//        }
//
//        // Step 4: Print the duplicates
//        System.out.println("Duplicates: " + duplicates);
//    }
//}
