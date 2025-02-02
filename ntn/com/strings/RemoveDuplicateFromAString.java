package ntn.com.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromAString {

    public static void main(String[] args) {

        String originalString = "programmer";
        removeDuplicateString(originalString);

        String sentence = "this is nitin this is java developer";
        removeDuplicateStringFromSentence(sentence);


    }

    private static void removeDuplicateString(String originalString){

        Set<String> set = new HashSet<>();
        String uniqueString = Arrays.stream(originalString.split(""))
                .filter(a-> set.add(a))
                .collect(Collectors.joining(""));
        System.out.println(uniqueString);
    }

    private static void removeDuplicateStringFromSentence(String originalString){

        Set<String> set = new HashSet<>();
        String uniqueString = Arrays.stream(originalString.split(" "))
                .filter(a-> set.add(a))
                .collect(Collectors.joining(" "));
        System.out.println(uniqueString);
    }

}
