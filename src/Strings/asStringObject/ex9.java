//посчитать маленькие и большие буквы строки(только латиница)

package Strings.asStringObject;

public class ex9 {
    public static void main(String[] args) {
        String str = "word слово ещёСлово theBiggestWord theBiggestEverWord";
        bigSmallLat(str);
    }
    public static void bigSmallLat(String str){
        int countSmall = 0;
        int countBig = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                countSmall++;
            }else if(ch >= 'A' && ch <= 'Z'){
                countBig++;
            }
        }
        System.out.println("Количество маленьких латинских букв: " + countSmall);
        System.out.println("Количество больших латинских букв: " + countBig);
    }

}
