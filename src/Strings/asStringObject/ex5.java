//сколько раз встречается буква а в строке

package Strings.asStringObject;

public class ex5 {
    public static void main(String[] args) {
        String str = "aakdkj aks aksd iov aal pld";
        char ch = 'a';
        System.out.println(aInAString(str, ch));

    }
    public static int aInAString(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
