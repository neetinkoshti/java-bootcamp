package ntn.com.hackerrank;

import java.util.Arrays;
import java.util.List;

public class PolimdromIndex {

    public static void main(String[] args) {

        String str = "bcbc";
        String str1 = "nitin";

        List<String> strings = Arrays.asList("bcbc","aaab","baa","aaa");

        strings.stream().forEach(str2->{
            System.out.println(polimdrom(str2));
        });


//        System.out.println(checkPolimdrom(str));
//        System.out.println(polimdrom(str));
    }

    public static int polimdrom(String str){

            int firstIndex = 0;
            int lastIndex = str.length();

            if(checkPolimdrom(str)){
                return -1;
            }
            else if(checkPolimdrom(str.substring(firstIndex+1 , lastIndex))){
                System.out.println("char to remove  :"+str.charAt(firstIndex) + " at index :"+firstIndex);
                return firstIndex;
            }else if(checkPolimdrom(str.substring(firstIndex , lastIndex-1))){
                System.out.println("char to remove  :"+str.charAt(lastIndex) + " at index :"+lastIndex);
                return lastIndex;
            }
        return -1;
    }

    public static boolean checkPolimdrom(String str){

        int length = str.length();
        int midIndex = str.length() /2 ; //2
        boolean flag = false;

        for(int x=0 , y = length; x < midIndex ;x++,y--){

            if(str.charAt(x) != str.charAt(y-1)){
                flag =false;
            }else{
                flag =true;
            }
        }
        return flag;
    }
}
