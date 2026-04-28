package Java11to20;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters20 {
    public static void printUniqueCharacters(String str){
        Set<Character> uniqueChar  = new HashSet<>();
        for (char ch : str.toCharArray()){
            uniqueChar.add(ch);
        }
        System.out.println("Unique Characters are \n"+uniqueChar);

    }
    public static void main(String[] args) {
        String input = "XnovaQIndiaPrivateLimited";
        printUniqueCharacters(input);
    }

}
