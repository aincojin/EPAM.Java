package Algorithmisation.One_DimArrays;

public class ex5 {
    public static void main(String[] args) {
        int[] array = {2,6,8,-4,15,21,1};

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        for(int i = 0; i < array.length; i++){
            if(array[i] > i){
                System.out.print(array[i] + "  ");
            }
        }
    }
}
