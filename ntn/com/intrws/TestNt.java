package ntn.com.intrws;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestNt {
    public static void main(String[] args) {

        int[] num = new int[] {3,2,1,5,6,4};
        int k = 11;
        int  n = 2;
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32);

        findNumbersWhichStartWith1(numbers);

        lengthOfLongestSubstring("pwwkew");

        findSomeOfTwoNumbersWithOrderNComplexity(num , k);

        findSomeOfTwoNumbersWithOrderNSquareComplexity(num,k);

        findKLargestElementFromArray(num,n);

        findKLargestElementWithoutSortInArray(num,n);

        findKLargestElementWithoutSortInArraySingleSearch(num,n);

    }



    private static void findNumbersWhichStartWith1(List<Integer> numbers) {
        List<Integer> lst=  numbers.stream().filter(n-> String.valueOf(n).startsWith("1")).collect(Collectors.toList());

        System.out.println("Numbers which start with 1 : "+lst);
    }

    private static void findSomeOfTwoNumbersWithOrderNComplexity(int[] num , int k) {
        for(int i = 0, j = i+1; i< num.length-1 ; i++ , j++){
                if(num[i] + num[j] == k){
                    System.out.println("O(n) : index of two numbers which sum is equals to K : {"+i+","+j+"}");
                    System.out.println(num[i] + num[j]);
                }
        }
    }

    private static void findSomeOfTwoNumbersWithOrderNSquareComplexity(int[] num , int k) {
        for(int i = 0; i< num.length ; i++ ){
            for(int j = i+1; j< num.length; j++){
                if(num[i] + num[j] == k){
                    System.out.println("O(n2) : index of two numbers which sum is equals to K : {"+i+","+j+"}");
                    System.out.println(num[i] + num[j]);
                }
            }
        }
    }

    public static void findKLargestElementFromArray(int[] num , int k){
           for(int i =0 ;i< num.length ;i++){
            for(int j =i+1 ; j< num.length;j++){
                if(num[i] > num[j]) {
                    int temp = num[j] ;
                    num[j] = num[i] ;
                    num[i] = temp;
                }
            }
        }

        System.out.println("K's largest element "+num[num.length-k]);
    }
    
    public static void lengthOfLongestSubstring(String s) {

        Set<String> set = new HashSet<>();

        String newString = "";

        for (int x = 0; x < s.length() - 1; x++) {

            if (set.add(s.charAt(x) + "")) {
                newString = newString + s.charAt(x);
            }
        }

        System.out.println("Longest Substring from string : "+newString);
    }

    private static void findKLargestElementWithoutSortInArray(int[] num, int k) {

        int largest = -1 ;
        int secondLargest =-1;

        for(int i=0;i < num.length ;i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }

        for(int i=0; i< num.length;i++){

            if(num[i] > secondLargest && num[i] != largest){
                secondLargest = num[i];
            }
        }

        System.out.println("Largest Element :"+ largest + " , Second Largest Element :"+secondLargest);
    }

    private static void findKLargestElementWithoutSortInArraySingleSearch(int[] num, int k) {

        int largest = -1 ;
        int secondLargest =-1;

        // int[] num = new int[] {3,2,1,5,6,4};

        for(int i=0;i < num.length ;i++){
            if(num[i] > largest){
                secondLargest = largest;
                largest = num[i];
            }else if(num[i] < largest && num[i] > secondLargest){
                secondLargest =num[i];
            }
        }

        System.out.println("Largest Element :"+ largest + " , Second Largest Element :"+secondLargest);
    }


}
