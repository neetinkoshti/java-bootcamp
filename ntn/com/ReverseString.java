package com.ntn.intws;

public class ReverseString {

    public static void main(String[] args) {

        String str = "java programmer";

        usingRecersiveMethod(str);

        usingTraversingString(str);

        usingInbuiltMethod(str);

        usingSwapCharOfEachIndex(str);

    }

    private static void usingRecersiveMethod(String str){

        if(str.length() == 1){
            System.out.print(str);
        }else{
            System.out.print(str.charAt(str.length()-1));
            usingRecersiveMethod(str.substring(0,str.length()-1));
        }
    }

    private static void usingTraversingString(String str) {
        String reverseString="";
        for(int i=str.length()-1 ; i >= 0 ;i--){

            reverseString = reverseString + str.charAt(i);
        }
        System.out.println("\n using Travering through String : "+reverseString);
    }

    private static void usingSwapCharOfEachIndex(String str) {

        char[] chArray = str.toCharArray();
        for(int i=0,j = str.length()-1 ;i < j ;i++,j--){

            char temp = chArray[i];
            chArray[i] = chArray[j];
            chArray[j] = temp;
        }
        System.out.println(String.copyValueOf(chArray));
    }

    private static void usingInbuiltMethod(String str) {

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

    }
}
