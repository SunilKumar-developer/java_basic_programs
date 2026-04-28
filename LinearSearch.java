public class LinearSearch {
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String a[]){
        int[] a1= {53,20,30,33,70,90};
        int key = 33;
        System.out.println(key+" is found at index: "+linearSearch(a1, key));
    }
}


//===================================================================================
//public class BinarySearch {
//
//    public static void binarySearch(int arr[], int first, int last, int key) {
//        int mid = (first + last) / 2;
//        while (first <= last) {
//            if (arr[mid] == key) {
//                System.out.println("Element is found at index: " + mid);
//                break;
//            }
//            else if (arr[mid] < key) {
//                first = mid + 1;
//            } else {
//                last = mid - 1;
//            }
//            mid = (first + last) / 2;
//        }
//        if (first > last) {
//            System.out.println("Element is not found!");
//        }
//    }
//
//    public static void main(String args[]) {
//        int arr[] = {-10, -5, 0, 3, 8, 12, 15};
//        int key = -5;
//        int last = arr.length - 1;
//        binarySearch(arr, 0, last, key);
//    }
//}
