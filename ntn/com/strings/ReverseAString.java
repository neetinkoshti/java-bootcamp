package ntn.com.strings;

import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ReverseAString {
    public static void main(String[] args) {

        String originalString = "i am a java programmer";

        System.out.println("\n1. Recursive Way to reverse a string : "+recursiveWayToReverseAString(originalString));

        System.out.println("\n2. Reverse A string using swap of chars :"+usingSwapOfChar(originalString));

        System.out.println("\n3. Reverse A string using stack: "+ reverseAStringUsingStack(originalString));

        System.out.println("\n4. Reverse String using order of N2 complexity : "+reverseString(originalString));

        System.out.println("\n5. Reverse a string using Java 8 : "+reverseStringUsingJava8(originalString));

        System.out.println("\n6. Reverse a String using recersion : ");
        recersiveWay(originalString);

        reverseStringUsingJava8SecondWay(originalString);


    }

    /**
     * Reverse a String/Sentence using for loop start from end
     * @param originalString
     * @return
     */
   private static String reverseString(String originalString) {

       String reverseString = "";
       for (int i = originalString.length() - 1; i >= 0; i--) {
           reverseString = reverseString + originalString.charAt(i);
       }
       return reverseString;
   }

    /**
     *  Reverse a String / Sentence using java 8
     * @param originalString
     * @return
     */
    private static String reverseStringUsingJava8(String originalString){

        String reversedStr = Stream.of(originalString.split(""))
                .reduce("",(reversed,character) -> character + reversed);

        return reversedStr;

    }

    /**
     *  Reverse a String / Sentence using Java 8
     * @param originalString
     */
    private static void reverseStringUsingJava8SecondWay(String originalString){
        System.out.println("\n7. Reverse a String using Java 8 second way");
        char[] charArray = originalString.toCharArray();

        IntStream.range(0,charArray.length)
                .mapToObj(i -> charArray[(charArray.length-1) - i])
                .forEach(System.out::print);
    }

    /**
     *  Reverse a String / Sentence using recersion method
     * @param originalString
     */
    private static void recersiveWay(String originalString){
        if(originalString.length() == 1){
            System.out.print(originalString);
        }else {
            System.out.print(originalString.charAt(originalString.length()-1));
            recersiveWay(originalString.substring(0,originalString.length()-1));
        }
    }

    private static String recursiveWayToReverseAString(String originalString){

        if(originalString==null || originalString.length()==1){
            return originalString;
        }
        else{
           return recursiveWayToReverseAString(originalString.substring(1)) + originalString.charAt(0);
        }
    }

    private static String usingSwapOfChar(String originalString){

        char[] charArray  =  originalString.toCharArray();

        int left = 0;
        int right = charArray.length-1;

        while(left < right){

            char ch = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = ch;

            left ++;
            right --;

        }

        return new String(charArray);
    }

    private static String reverseAStringUsingStack(String originalString){

        Stack<Character> stacks = new Stack<>();

        for(int i=0;i<originalString.length();i++){

            stacks.push(originalString.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while(!stacks.isEmpty()){

            sb.append(stacks.pop());
        }
        return sb.toString();
    }

}
