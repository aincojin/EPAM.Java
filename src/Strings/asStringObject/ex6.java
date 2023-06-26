//вывести новую строку, повторив каждый символ данной строки дважды

package Strings.asStringObject;

public class ex6 {
    public static void main(String[] args) {
        String str = "Daily double";
        System.out.println(doubleString(str));
    }
    public static String doubleString(String str){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char insertChar = str.charAt(i);
            sb.append(insertChar).append(insertChar);

        }
        return sb.toString();

    }
}
