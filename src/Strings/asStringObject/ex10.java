//определить количество предложений в строке

package Strings.asStringObject;

public class ex10 {
    public static void main(String[] args) {
        String str = "Sentence. Sentence! Sentence?";
        System.out.println(countSentences(str));
    }
    public static int countSentences(String str){
        String[] words;
        words = str.split("[.!?]");
        int count = 0;
        for(int i = 0; i < words.length; i++){
            count++;
        }
        return count;
    }
}
