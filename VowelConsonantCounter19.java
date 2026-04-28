package Java11to20;

public class VowelConsonantCounter19 {
    private static void countVowelConsonant(String string){
        int CountVowels = 0;
        int CountConsonant = 0;
        string = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(Character.isAlphabetic(ch)){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    CountVowels++;
                }else {
                    CountConsonant++;
                }
            }
        }
        System.out.println("Vowels Count : "+CountVowels);
        System.out.println("Consonant Count : "+CountConsonant);
    }
    public static void main(String[] args) {
        String str = "XnovaQ India Private Limited";
        countVowelConsonant(str);
    }
}
