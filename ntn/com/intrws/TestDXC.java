package ntn.com.intrws;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDXC {


    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     *
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     *  ========
     * Input: strs = [""]
     * Output: [[""]]
     *   ========
     * Input: strs = ["a"]
     * Output: [["a"]]
     *  ========
     * @param args
     */
    public static void main(String[] args) {

        List<String> lists = Arrays.asList("eat","tea","tan","ate","nat","bat");


        Map<String, List<String>> collect = groupAnagramString(lists);

        System.out.println(collect);

    }

    private static Map<String, List<String>> groupAnagramString(List<String> lists) {
        Map<String, List<String>> collect = lists.stream()
                .collect(Collectors.groupingBy(s -> {

                    char[] ch = s.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);
                }));
        return collect;
    }
}
