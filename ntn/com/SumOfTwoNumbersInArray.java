package com.ntn.intws;

import java.sql.SQLOutput;
import java.util.*;

public class SumOfTwoNumbersInArray {

    public static void main(String[] args) {

        int[] array = new int[]{1,4,3,2,0,5,7,8};
        int target = 5;

        usingBruteForceMethod(array,target);

        usingHashSetMethod(array,target);

        usingHashMapMethod(array,target);
    }

    private static void usingHashMapMethod(int[] array, int target) {

        System.out.println("Using Hash Map Method");
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< array.length;i++){
            int secondElement = target - array[i];

            if(map.containsKey(secondElement)){
                System.out.println("(i,j) : ("+i+","+map.get(secondElement)+")" + " : ("+array[i]+","+secondElement+")");
            }else{
                map.put(array[i],i);
            }
        }
    }

    private static void usingHashSetMethod(int[] array, int target) {
        System.out.println("Using Hash Set Method");
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<array.length;i++){

            int secondElement = target - array[i];

            if(set.contains(secondElement)){
                System.out.println("("+array[i]+","+secondElement+")");
            }else{
                set.add(array[i]);
            }
        }
    }

    private static void usingBruteForceMethod(int[] array , int target ){
        System.out.println("Using Brute Force Method");
        for (int i=0; i<array.length ;i++){
            for(int j=i+1; j<array.length-1;j++){
                if(array[i] +array[j] == target){
                    System.out.println("(i,j) : (" +i+","+j +") - (" +array[i]+ ","+array[j] +") : target - "+target);
                }
            }
        }
    }
}
