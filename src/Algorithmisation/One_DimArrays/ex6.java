package Algorithmisation.One_DimArrays;

public class ex6 {
    public static void main(String[] args) {
        double[] array = {1.54, -2.001, 4.38, 0.472, 1.296, -0.6, 3.21, 8.0234, -2.1};

        double sum = 0;

        for(int i = 2; i < array.length; i++){
            int count = 0;
            for(int j = 2; j < i; j++){
                if((i+1) % j == 0) {
                    count ++;
                }

            }
            if(count ==0){
                sum += array[i];
                System.out.print(array[i]+"  ");
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
