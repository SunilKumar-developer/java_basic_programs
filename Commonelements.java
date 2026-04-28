import java.util.ArrayList;
import java.util.Arrays;
public class Commonelements {
    public static void main(String[] args) {
        Integer[] array1 = {4, 2, 7, 1, 6};
        Integer[] array2 = {6, 7, 9, 8, 4};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        list1.retainAll(list2);
        System.out.println("Common Elements: " + list1);
    }
}
