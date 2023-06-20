package Algorithmisation.Sorting;

public class ex5 {
    public static void main(String[] args) {

        int[] array = {2,4,4,8,1,12,3,9};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int insertionIndex = binarySearch(array, temp, 0, i - 1);

            // Сдвиг всех элементов вправо для освобождения места вставки
            for (int j = i; j > insertionIndex; j--) {
                array[j] = array[j - 1];
            }

            array[insertionIndex] = temp;
        }
    }

    private static int binarySearch(int[] array, int key, int left, int right) {
        if (left > right) {
            return left;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == key) {
            return mid;
        } else if (array[mid] < key) {
            return binarySearch(array, key, mid + 1, right);
        } else {
            return binarySearch(array, key, left, mid - 1);
        }
    }
}
