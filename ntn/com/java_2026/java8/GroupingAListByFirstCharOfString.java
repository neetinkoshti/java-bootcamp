package ntn.com.java_2026.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAListByFirstCharOfString {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("nitin","neevidita","akshay","amit","john");

        System.out.println(listStartWithFirstChar(strings));

    }

    private static Map<Character,List<String>> listStartWithFirstChar(List<String> words){

        Map<Character,List<String>> map = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0) , Collectors.toList()));
        return map;
    }

}
