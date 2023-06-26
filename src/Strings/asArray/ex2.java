//replace all instances of "word" to "letter"
package Strings.asArray;

public class ex2 {
    public static void main(String[] args) {
        String str = "word abc hfj word word wordword";
        String newStr = str.replace("word", "letter");
        System.out.println(newStr);
    }
}
