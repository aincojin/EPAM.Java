//после каждого а вставить b

package Strings.asStringObject;

public class ex2 {
    public static void main(String[] args) {
        String str = " a aa dgf dav hdaa";
        System.out.println(bAfterA(str));
    }
    public static String bAfterA(String str){
        char insertChar = 'b';
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == 'a') {
                sb.insert(i + 1, insertChar);
            }
        }
        return sb.toString();

    }
}
