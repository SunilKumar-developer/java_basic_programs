class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i; // Assume the first element is the minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) { // For loop for printing
            System.out.print(arr[i] + " ");
        }
        SelectionSort selection=new SelectionSort();

        selection.selectionSort(arr);

        System.out.println("\nSorted array:");
        for (int i = 0; i < arr.length; i++) { // For loop for printing
            System.out.print(arr[i] + " ");
        }
    }
}
