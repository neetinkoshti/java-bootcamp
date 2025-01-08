package ntn.com.hackerrank;

import java.util.Arrays;

public class RepeatedString {

    public static void main(String[] args) {

        String s = "abcac";
//        String s = "aba";
        int finalLengthOfString = 10;
        // output --> abcacabcac , repeated a is 4

        printRepeatedStringTillfinalLengthAndItsCount(finalLengthOfString, s);

        optimalApproach(s , 'a' , finalLengthOfString);

    }

    private static void optimalApproach(String str , char charToFound , int finalLengthOfString){

        int completeStringCount = finalLengthOfString / str.length() ;
        int divisor = finalLengthOfString % str.length();

        int count = (completeStringCount * foundFrequencyOfTheChar(str , str.length(),charToFound) ) +foundFrequencyOfTheChar(str,divisor,charToFound) ;
        System.out.println("count : " + count);
    }

    private static int foundFrequencyOfTheChar(String str , int strLength , char charToFound){

        int count=0;
        for(int x = 0 ;x < strLength ;x++){
            if(str.charAt(x) == charToFound){
                count++;
            }
        }
        return count ;
    }

    private static void printRepeatedStringTillfinalLengthAndItsCount(int finalLengthOfString, String s) {
        String newString="";

        int x =0;

        while( newString.length() < finalLengthOfString){
            if(x <= s.length()-1){
                newString = newString +  s.charAt(x);
                x++;
            }else{
                x=0;
            }
        }

        long count = Arrays.stream(newString.split(""))
                .filter(str -> str.equals("a"))
                        .count();

        System.out.println("new String : "+newString + " ,  count :" + count);
    }
}
