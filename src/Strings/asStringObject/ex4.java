//из слова информатика составить слово торт

package Strings.asStringObject;

public class ex4 {
    public static void main(String[] args) {
        String word = "информатика";

        String cake = String.valueOf(word.charAt(7)) + word.charAt(3) + word.charAt(4) + word.charAt(7);

        System.out.println(cake); //

    }
}
