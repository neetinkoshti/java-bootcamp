package ntn.com.intrws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEPAM {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,1,2,4,5);

        System.out.println(commulativeSumOfNumberInAList(numbers));
        // expected output (1,2,4,8,13)

        int[] num = usingArray(numbers);
        for(int i : num)
            System.out.print(i+",");
    }

    private static List<Integer> commulativeSumOfNumberInAList(List<Integer> numbers){

        List<Integer> newList = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<numbers.size() ; i++){

            sum +=numbers.get(i);
            newList.add(sum);
        }

        return newList;
    }

    private static int[] usingArray(List<Integer> numbers){

        int[] nums = numbers.stream().mapToInt(i->i).toArray();

        int[] newArray = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            newArray[i] = sum;
        }
        return newArray;
    }
}
