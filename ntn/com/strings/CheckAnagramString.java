package ntn.com.strings;

import java.util.Arrays;

public class CheckAnagramString {

    public static void main(String[] args) {
        String str1= "ACT";
        String str2 = "CAT";

        System.out.println(checkAnagram(str1 , str2));
        System.out.println(checkAnagramSecondWay(str1 , str2));
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
}
