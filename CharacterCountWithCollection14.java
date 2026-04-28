package Java11to20;

import java.util.HashMap;

public class CharacterCountWithCollection14 {
    private static void main(String[] args) {
        String input = "XnovaQ India Private Limited";
        countCharacters(input);
    }
    public static void countCharacters(String input){
        HashMap<Character,Integer> count=new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(Character.isLetterOrDigit(currentChar)||currentChar==' '){
                count.put(currentChar,count.getOrDefault(currentChar,0)+1);
            }
        }
        for (char c:count.keySet()){
            System.out.println(c+": "+count.get(c));
        }
    }
}
