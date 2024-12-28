package ntn.com;

import java.util.Arrays;
import java.util.List;

public class FindHighestNumFromList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 1 , 2,5 ,8,9,10,7,25,23,17,24);

        int highestNum = getSecondHighestNum(numbers , 1 , 0);
        System.out.println(highestNum);


        int secondHighestNum = getSecondHighestNum(numbers , 2 , 1);
        System.out.println(secondHighestNum);

        int thirdHighestNum = getSecondHighestNum(numbers , 3 , 2);
        System.out.println(thirdHighestNum);
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
