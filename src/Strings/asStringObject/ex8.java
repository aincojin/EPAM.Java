//вывести самое длинное слово из строки

package Strings.asStringObject;

public class ex8 {
    public static void main(String[] args) {
        String str = "word theBiggestWord theBiggestEverWord";
        String[] words;
        words = str.split("\\s+");
        System.out.println(findingTheWord(words));
    }
    public static String findingTheWord(String[] arr){
        int count = Integer.MIN_VALUE;
        String theWord = "";
        for(int i = 0; i < arr.length; i++){
            int countingChar = 0;
            for(int j = 0; j < arr[i].length(); j++){
                countingChar++;
            }
            if(countingChar > count){
                count = countingChar;
                theWord = arr[i];
            }
        }
        return theWord;
    }
}
