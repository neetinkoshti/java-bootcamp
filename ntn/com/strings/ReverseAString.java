package ntn.com.strings;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ReverseAString {
    public static void main(String[] args) {

        String originalString = "i am a java programmer";

        System.out.println("Reverse String using order of N complexity : "+reverseString(originalString));

        System.out.println("Reverse a string using Java 8 : "+reverseStringUsingJava8(originalString));

        System.out.println("Reverse a String using recersion : ");
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
        System.out.println("\n Reverse a String using Java 8 second way");
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

}
