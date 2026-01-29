package com.ntn.intws;

import java.util.*;

/**
 * // For this challenge you will be determining the largest number of unique characters between two letters.
 *
 * have the function MatchingCharacters(str) take the str parameter being passed
 * and determine the largest number of unique characters that exists between a pair of matching letters anywhere in the string.
 *
 * For example: if str is "ahyjakh" then there are only two pairs of matching letters,
 * the two a's and the two h's. Between the pair of a's there are 3 unique characters: h, y, and j.
 * Between the h's there are 4 unique characters: y, j, a, and k. So for this example your program should return 4.
 *
 * Another example: if str is "ghececgkaem" then your program should return 5
 * because the most unique characters exists within the farthest pair of e characters.
 * The input string may not contain any character pairs, and in that case your program should just return 0.
 * The input will only consist of lowercase alphabetic characters.
 *
 */
public class MatchingCharacters {
    public static void main(String[] args) {

        System.out.println("ahyjakh : --> "+matchingCharacters("ahyjakh"));
        System.out.println("ghececgkaem : --> "+matchingCharacters("ghececgkaem"));
    }

    public static int matchingCharacters(String str){
        int maxLength=0;
        Map<Character,Integer> charFreq = new HashMap<>();
        for(int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            if(charFreq.containsKey(ch)){
                int firstIndex = charFreq.get(ch);
                Set<String> setOfUniqueChars = countCharFrequency(str.substring(firstIndex+1 , i ));
                maxLength = Math.max(maxLength,setOfUniqueChars.size());
            }else{
                charFreq.put(ch,i);
            }
        }

        return maxLength;
    }

    private static Set<String> countCharFrequency(String str){
        Set<String> set = new HashSet<>();
        Arrays.stream(str.split("")).forEach(s -> set.add(s));
        System.out.println(set);
        return set ;
    }
}
