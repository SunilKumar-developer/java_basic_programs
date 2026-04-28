public class LargestandSmallest {
    public static void main(String[] args) {
        int[] array = {15, 3, 7, 20, 9}; // Replace with your array

        // Initialize largest and smallest with the first element of the array
        int largest = array[0];
        int smallest = array[0];
//        // Traverse the array to find the largest and smallest
//        for (int i : array) {
        for(int i =0;i< array.length-1;i++){
            if (i > largest) {
                largest = i; // Update largest
            }
            if (i < smallest) {
                smallest = i; // Update smallest
            }
        }

        // Print the results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
