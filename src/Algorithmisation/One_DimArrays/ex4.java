package Algorithmisation.One_DimArrays;

public class ex4 {
    public static void main(String[] args) {

        double[] array = {-4.647, -0.5, 3, 2.98, 60, 2, 10};

        int max_array = 0;
        int min_array = 0;

        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < array.length; ++i){
                if(array[i] > array[max_array]) {
                    max_array = i;
                }
                if(array[i] < array[min_array]) {
                    min_array = i;
                }
        }
        double t;
        if(max_array != min_array){
            t = array[max_array];
            array[max_array] = array[min_array];
            array[min_array] = t;
        }

        for(int i =0; i< array.length; i++){
            System.out.print(array[i] + "  ");
        }

    }
}
