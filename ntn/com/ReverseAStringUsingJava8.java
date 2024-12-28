package ntn.com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseAStringUsingJava8 {
    public static void main(String[] args) {

        String originalString = "i am a java programmer";

        System.out.println(reverseStringUsingJava8(originalString));

        reverseStringUsingJava8SecondWay(originalString);

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

       char[] charArray = originalString.toCharArray();

       IntStream.range(0,charArray.length)
               .mapToObj(i -> charArray[(charArray.length-1) - i])
               .forEach(System.out::print);
   }

}
