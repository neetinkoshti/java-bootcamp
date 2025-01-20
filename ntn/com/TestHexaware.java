package ntn.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestHexaware {
    public static void main(String[] args) {

        String name = "Nitin Koshti";

        Set<String> set = new HashSet<>();

        String uniqueStr = Arrays.stream(name.toLowerCase().split(""))
                .filter(s ->  set.add(s)).collect(Collectors.joining(""));

        System.out.println(uniqueStr);

        List<String> list=  Arrays.stream(name.toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .map(stringLongEntry -> stringLongEntry.getKey())
                .collect(Collectors.toList());

        System.out.println(list);

        Map<String,Long> map =Arrays.stream(name.toLowerCase().split(""))
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()))
                .entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .collect(Collectors.toMap(stringLongEntry -> stringLongEntry.getKey() , stringLongEntry -> stringLongEntry.getValue() ));

        System.out.println(map);
    }
}
