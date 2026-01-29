package ntn.com;

import java.util.Arrays;

public class CheckThreeNumberSumFromIntegerArrays {

    public static void main(String[] args) {

        int[] array = new int[] { 0 , 1 , 3 , 2 , 4 , 5 , 6 , 7};
        int sum = 5;
        checkThreeNumSum(array , sum);

        checkThreeNumSumUsingJava8(array,sum);
    }

    private static void checkThreeNumSumUsingJava8(int[] array, int sum) {

        Arrays.stream(array)
                .forEach(a -> Arrays.stream(array)
                        .forEach( b -> Arrays.stream(array)
                                .forEach(c-> {
                                    if(a+b+c == sum){
                                        System.out.println("Using Java8 : "+a+","+b+","+c);
                                    }
                        })

                ));

    }

    private static void checkThreeNumSum(int[] array , int sum){

        for (int i =0 ;i < array.length -1 ; i++){
            for(int j=i ; j < array.length -1 ; j++){
                for(int k=j ; k < array.length -1 ; k++){

                if(array[i] + array[j] +array[k]  == sum){
                    System.out.println(array[i] + "," +array[j] + "," +array[k]);
                }
                }
            }
        }
    }
}
