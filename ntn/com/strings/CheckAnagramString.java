package ntn.com.strings;

import java.util.Arrays;

public class CheckAnagramString {

    public static void main(String[] args) {
        String str1= "ACT";
        String str2 = "CAD";

//        System.out.println(checkAnagram(str1 , str2));
//        System.out.println(checkAnagramSecondWay(str1 , str2));
        System.out.println(checkAnagramStringUsingCharFrequencyCountMethod(str1,str2));
    }

    private static boolean checkAnagram(String str1 , String str2){

        if(str1.length() != str2.length())
            return false;

        String[] strArray = str1.split("");
        for(String s : strArray){
            if(!str2.contains(s))
                return false;
        }
        return true;
    }

    private static boolean checkAnagramSecondWay(String str1 , String str2){

        if(str1.length() != str2.length())
            return false;

        char[] firstChar = str1.toCharArray();
        char[] secondChar = str2.toCharArray();

        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        return Arrays.equals(firstChar , secondChar);
    }

    private static boolean checkAnagramStringUsingCharFrequencyCountMethod(String s1,String s2){

        if(s1.length() != s2.length())
            return false;

        int[] freq = new int[255] ;

        for(int i=0 ; i< s1.length() ;i++){
            freq[s1.charAt(i)] ++ ;  // ACT
            freq[s2.charAt(i)] -- ;  // CAT
        }


        for(int count = 0 ; count < freq.length ; count ++ ){
            if( freq[count] !=0 ){
                return false;
            }
        }


        return true;
    }
}
