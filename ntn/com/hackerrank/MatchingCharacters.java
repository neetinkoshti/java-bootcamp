package ntn.com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

/**
 * For this challenge you will be determining the largest number of unique characters
 * between two letters.
 * have the function MatchingCharacters(str) take the str parameter being passed
 * and determine the largest number of unique characters that exists between a pair of matching
 * letters anywhere in the string.
 * For example: if str is "ahyjakh" then there are only two pairs of matching letters,
 * the two a's and the two h's. Between the pair of a's there are 3 unique characters: h, y, and j.
 * Between the h's there are 4 unique characters: y, j, a, and k.
 * So for this example your program should return 4.
 * Another example: if str is "ghececgkaem" then your program should return 5
 * because the most unique characters exists within the farthest pair of e characters.
 * The input string may not contain any character pairs,
 * and in that case your program should just return 0.
 * The input will only consist of lowercase alphabetic characters.
 *
 */
public class MatchingCharacters {

    public static void main(String[] args) {
        String str = "ahyjakh";
         str = "ghececgkaem";

        int length = determineLargestNumOfUniqueCharBetweenTwoLetters(str);
        System.out.println(length);
    }

    private static int determineLargestNumOfUniqueCharBetweenTwoLetters(String str) {

        int lenght = 0;
        Map<Character,Integer> map = new HashMap<>();

        for (int i=0; i< str.length() ;i++){

            if(map.containsKey(str.charAt(i))){
                int firstIndex = map.get(str.charAt(i));
                    Set<String> set = countUniqueLength(str.substring(firstIndex+1 , i));
                System.out.println(set);

                lenght = Math.max(lenght , set.size());

            }else{
                map.put(str.charAt(i) ,  i);
            }
        }
        return lenght ;
    }

    private static Set<String> countUniqueLength(String substring) {
        return Arrays.stream(substring.split(""))
                .collect(Collectors.toSet());
    }
}
