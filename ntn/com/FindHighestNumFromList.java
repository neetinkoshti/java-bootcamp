package ntn.com;

import java.util.Arrays;
import java.util.List;

public class FindHighestNumFromList {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList( 1 , 2,5 ,8,9,10,7,25,23,17,24);

        List<Integer> numbers = Arrays.asList( 1,5,7,8,9,6,25,12,15,36,37,35,85,64,27,79,77);

        findHeighestNum(numbers);

        findSecondHeighest(numbers);

        int highestNum = getSecondHighestNum(numbers , 1 , 0);
        System.out.println(highestNum);


        int secondHighestNum = getSecondHighestNum(numbers , 2 , 1);
        System.out.println(secondHighestNum);

        int thirdHighestNum = getSecondHighestNum(numbers , 3 , 2);
        System.out.println(thirdHighestNum);

        int[] numArray = new int[] {1,5,7,8,9,6,25,12,15,36,37,35,85,64,27,79,77};
        findTwoLargest(numArray);

    }

   private static void findTwoLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second highest element");
        } else {
            System.out.println("Highest: " + max);
            System.out.println("Second Highest: " + secondMax);
        }
    }


    private static void findSecondHeighest(List<Integer> numbers) {

        int first = 2 ;
        int second =1 ;

        for(int i=0;i<numbers.size() ;i++){

            if(numbers.get(i) > second && numbers.get(i) > first){
                first = numbers.get(i);
            }else if (numbers.get(i) > second && numbers.get(i) < first){
                second = numbers.get(i);
            }

        }
        System.out.println("findSecondHeightst : "+ first + ", "+ second);
    }

    private static void findHeighestNum(List<Integer> numbers) {

        int heighestNum = 1;

        for(int i=0 ; i<numbers.size();i++){

            if(numbers.get(i) > heighestNum){
                heighestNum = numbers.get(i);
            }
        }

        System.out.println("findHeighestNumber : "+heighestNum);

    }

    private static int getSecondHighestNum(List<Integer> numbers , int limit ,int skip) {
        int secondHighestNum = numbers
                .stream()
                .sorted((a,b) -> b.compareTo(a) )
                .limit(limit)
                .skip(skip)
                .findFirst()
                .get();
        return secondHighestNum;
    }
}
