package Java11to20;

import java.util.Arrays;

public class AnagramChecker18 {
    private static boolean isAnagramCheck(String str1,String str2){
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);

    }
    public static void main(String[] args) {
        String str1 = "Night";
        String str2 = "Thing";
        if(isAnagramCheck(str1,str2)){
            System.out.println(str1+" and "+str2+" are anagram");
        }else {
            System.out.println(str1+" and "+str2+" are not anagram");
        }
    }
}
