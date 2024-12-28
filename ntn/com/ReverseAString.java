package ntn.com;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseAString {
    public static void main(String[] args) {

        String originalString = "i am a java programmer";

        System.out.println(reverseString(originalString));

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
}
