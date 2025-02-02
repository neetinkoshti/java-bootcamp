package ntn.com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSumFromArray {

    public static void main(String[] args) {
        int[] array = new int[] { 0 , 1 , 3 , 2 , 4 , 5 , 6 , 7};
        int target = 7;

        findPairsOfTwoNumberSumToTarget(array,target);

    }

    private static void findPairsOfTwoNumberSumToTarget(int[] array, int target) {

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
}
