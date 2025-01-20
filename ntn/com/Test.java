package ntn.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        String str = "nitin as a java programmer";

        Set<String> set = new HashSet<>();

        String str1 = Arrays.stream(str.replace(" ","").split(""))
                .filter(a-> !set.add(a))
                .findFirst().get();

        System.out.println(str1);

        Map<String, Long> collect = Arrays.stream(str.replace(" ","").split(""))
                .filter(a-> !set.add(a))

                .collect(Collectors.groupingBy(Function.identity() , LinkedHashMap::new, Collectors.counting()));

        Map.Entry<String, Long> stringLongEntry1 = collect.entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)

                .findFirst().get();

        System.out.println(stringLongEntry1.getKey() + "," + stringLongEntry1.getValue());
    }
}
