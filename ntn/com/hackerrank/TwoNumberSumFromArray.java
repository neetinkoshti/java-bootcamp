package ntn.com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSumFromArray {

    public static void main(String[] args) {
        int[] array = new int[] { 0 , 1 , 3 , 2 , 4 , 5 , 6 , 7};
        int target = 7;

        findPairsOfTwoNumberSumToTarget(array,target);

        findPairsOfTwoNumberSumToTargetBruteForce(array,target);

        findPairsOfTwoNumberSumToTargetBruteForceJava8(array,target);

    }

    private static void findPairsOfTwoNumberSumToTarget(int[] array, int target) {

        System.out.println("Using Map Method");
        Map<Integer , Integer> map = new HashMap<>();
        for (int i =0 ;i < array.length ;i++){

            int secondNum = target - array[i];

            if(map.containsKey(secondNum)){
                System.out.println("indexes : (i,J) : ("+map.get(secondNum)+","+i + ") :Pairs :("+secondNum+","+array[i]+")");
            }else{
                map.put(array[i] , i) ;
            }
        }
    }


    private static void findPairsOfTwoNumberSumToTargetBruteForceJava8(int[] array, int target) {

        System.out.println("Using Brute Force Method : Java 8");
        Arrays.stream(array)
                .forEach(a-> Arrays.stream(array).forEach(b -> {

                    if(a + b == target){
                        System.out.println(a + "," +b);
                    }
                }));
    }

    private static void findPairsOfTwoNumberSumToTargetBruteForce(int[] array, int target) {
        System.out.println("Using Brute Force Method");
        for (int i =0 ;i < array.length ; i++){
            for(int j=i+1 ; j < array.length ; j++){

                if(array[i] + array[j] == target){
                    System.out.println(array[i] + "," +array[j]);
                }
            }
        }
    }
}
