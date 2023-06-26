//является ли слово палиндромом

package Strings.asStringObject;

public class ex3 {
    public static void main(String[] args) {

        String str = "  Level";

        if(isPalindrome(str)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static boolean isPalindrome(String str){
        String newStr = str.trim().toLowerCase();
        StringBuilder sb = new StringBuilder(newStr);

        int left = 0;
        int right = sb.length() - 1;

        // Сравниваем символы с обоих концов слова
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
