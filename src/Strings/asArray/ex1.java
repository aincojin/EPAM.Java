//from camelCase to snake_case
package Strings.asArray;

public class ex1 {
    public static void main(String[] args) {
        String[] arr = {"firstLetter", "newVariable", "theLastNum"};

        for(int i = 0; i < arr.length; i++){
            arr[i] = eachLetterCheck(arr[i]);
            System.out.println(arr[i] + " ");
        }
    }

    public static String eachLetterCheck(String a){
        String result = "";
        char c = a.charAt(0);
        result = result + Character.toLowerCase(c);
        for(int i = 1; i < a.length(); i++){

            char ch = a.charAt(i);
            if(Character.isUpperCase(ch)){
                result = result + "_";
                result += Character.toLowerCase(ch);
            }else{
                result = result + ch;
            }
        }
        return result;
    }

}
