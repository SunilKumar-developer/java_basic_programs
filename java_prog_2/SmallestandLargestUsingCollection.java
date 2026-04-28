
import java.util.Arrays;
import java.util.Collections;

        public class SmallestandLargestUsingCollection {
            public static void main(String[] args) {
                // Initialize the array
                int [] array = {2, 10, 3, 8, 5, 9};

                // Sort the array using Arrays.sort()
                Arrays.sort(array);

                // The smallest element will be the first element after sorting
                int largest = array[0];
                // The largest element will be the last element after sorting
                int smallest = array[array.length - 1];

                // Print the sorted array, smallest and largest elements
                System.out.println("Sorted array: " + Arrays.toString(array));
                System.out.println("Smallest element: " + smallest);
                System.out.println("Largest element: " + largest);
            }
        }

