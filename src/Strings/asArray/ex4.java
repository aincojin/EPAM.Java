//найти количество чисел в строке
package Strings.asArray;

public class ex4 {
    public static void main(String[] args) {
        String str = "1 3ds dkd dk37 8";
        String [] nums;
        int count = 0;
        nums = str.split(" ");
        System.out.print("Numbers in this string: ");
        for(int i = 0; i < nums.length; i++){
            if(nums[i].matches("-?\\d+")){
                count++;
                System.out.print(nums[i] + " ");
            }

        }
        System.out.println("\nAmount of numbers: " + count);

    }
}
