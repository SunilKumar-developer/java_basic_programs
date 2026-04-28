public class MissingNumbers1 {
    public static void findMissingNumbers(int[] arr, int max) {
        for (int i = 1; i <= max; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline to separate the output.
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7};
        int max = 7;
        System.out.println("Missing numbers in the array:");
        findMissingNumbers(arr, max);
    }
}


//================================================================================

//public class MissingNumber1 {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 4, 5, 6}; // Array with a missing number
//        int n = 6; // Total number of elements including the missing one
//
//        int totalSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
//        int arraySum = 0;
//
//        // Calculate the sum of elements in the array
//        for (int num : array) {
//            arraySum += num;
//        }
//
//        // The missing number is the difference
//        int missingNumber = totalSum - arraySum;
//
//        System.out.println("The missing number is: " + missingNumber);
//    }
//}
