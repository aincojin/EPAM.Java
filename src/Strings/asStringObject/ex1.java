//найти наибольшее кол-во подряд расположенных пробелов

package Strings.asStringObject;

public class ex1 {
    /*public static void main(String[] args) {
        String str = " 1     3ds  dkd dk37 8  ";

    }*/
    public static void main(String[] args) {
            String str = " 1    3ds  dkd dk37 8  ";
            System.out.println(replaceSpaces(str));

    }
    private static int replaceSpaces(String str) {
        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }

}
