package ntn.com;

import java.util.Arrays;

public class CheckTwoNumberSumUsingLambdaExpression {

    public static void main(String[] args) {

        int[] array = new int[] { 0 , 1 , 3 , 2 , 4 , 5 , 6 , 7};
        int sum = 5;
        checkTwoNumSum(array , sum);
    }

    private static void checkTwoNumSum(int[] array , int sum){

        Arrays.stream(array)
                .forEach(a-> Arrays.stream(array).forEach(b -> {

            if(a + b == sum){
                System.out.println(a + "," +b);
            }
        }));
    }
}
