package ntn.com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseAStringUsingRecersion {
    public static void main(String[] args) {

        String originalString = "i am a java programmer";

        recersiveWay(originalString);
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
