//удалить лишние пробелы и пробелы в начале/конце строки

package Strings.asArray;

public class ex5 {
    public static void main(String[] args) {
        String str = " 1     3ds  dkd dk37 8  ";
        String newStr = str.replaceAll("\\s+", " ");
        newStr = newStr.trim();
        System.out.println(newStr);
    }
}
