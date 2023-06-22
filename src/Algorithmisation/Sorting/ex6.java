package Algorithmisation.Sorting;

public class ex6 {
    public static void main(String[] args) {
        int[] arr = {4, 11, 2, 5, 21};
        int n = 5;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i ++) {
                // Копируем значение в temp
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
    }

}
