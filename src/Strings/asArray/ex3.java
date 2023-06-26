//найти количество цифр в строке
package Strings.asArray;

public class ex3 {
    public static void main(String[] args) {
        String str = "1 3ds dkd dk37 8";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Количество цифр в строке: " + count);
    }
}
