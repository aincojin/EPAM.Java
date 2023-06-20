package Algorithmisation.Sorting;

public class ex3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9};


        int k = arr.length - 1;

        for (int j = 0; j < arr.length / 2; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = j; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            k--;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.printf("%3d", arr[j]);
        }

    }
}
