//написать анализатор для последовательного возвращения содержимого узлов xml-документа
//и его тип(откр.тег, содержимое тега, закр.тег) для след.строки:
//<notes>
//     <note id = "1">
//        <to>Вася</to>
//        <from>Света</from>
//        <heading>Напоминание</heading>
//        <body>Позвони мне завтра!</body>
//     </note>
//     <note id = "2">
//         <to>Петя</to>
//         <from>Маша</from>
//         <heading>Важное напоминание</heading>
//         <body/>
//     </note>
//  </notes>

package Strings.Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {

        String str = "<notes>\n" +
                "     <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "     </note>\n" +
                "     <note id = \"2\">\n" +
                "         <to>Петя</to>\n" +
                "         <from>Маша</from>\n" +
                "         <heading>Важное напоминание</heading>\n" +
                "         <body/>\n" +
                "     </note>\n" +
                "  </notes>";

        System.out.println(strAnalyze(str));
    }
    public static String strAnalyze(String str){

        StringBuilder sb = new StringBuilder();

        Pattern patOpening = Pattern.compile("<\\w.+?>");
        Pattern patClosing = Pattern.compile("</.+?>");
        Pattern patContent = Pattern.compile(">(.+?)<");
        Pattern patEmpty = Pattern.compile("<.+?\\s*/>");

        String[] strings = str.split("\n\\s*");

        for (String string : strings) {
            Matcher matOpening = patOpening.matcher(string);
            Matcher matClosing = patClosing.matcher(string);
            Matcher matContent = patContent.matcher(string);
            Matcher matEmpty = patEmpty.matcher(string);

            if (matOpening.find()) {
                sb.append(matOpening.group());
                sb.append(" - открывающий тег;\n");
            }
            if (matClosing.find()) {
                sb.append(matClosing.group());
                sb.append(" - закрывающий тег;\n");
            }
            if (matContent.find()) {
                sb.append(matContent.group());
                sb.append(" - тело тега;\n");
            }
            if (matEmpty.find()) {
                sb.append(matEmpty.group());
                sb.append(" - тег без тела;\n");
            }
        }
        return sb.toString();
    }
}
