package Algorithmisation.Sorting;

public class ex4 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int count = 0;
        for( int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }

        for( int i = 0; i < arr.length; i++){
            System.out.printf("%3d", arr[i]);

        }
        System.out.printf("\nКоличество перестановок: " + count);
    }
}
