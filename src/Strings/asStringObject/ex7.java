//если символы повторяются,вывести их только один раз + убрать все пробелы

package Strings.asStringObject;

public class ex7 {
    public static void main(String[] args) {
        String str = "abb kdo mna; mal lam 'a,dd";
        System.out.println(deleteMultiple(str));
    }
    public static String deleteMultiple(String str){

        str = str.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length() - 1; i++){
            char ch = sb.charAt(i);
            for(int j = i + 1; j < sb.length(); j++){
                if(sb.charAt(j) == ch){
                    sb.deleteCharAt(j);
                }
            }
        }
        return sb.toString();
    }
}
