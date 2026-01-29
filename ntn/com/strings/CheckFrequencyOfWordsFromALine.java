package ntn.com.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckFrequencyOfWordsFromALine {

    public static void main(String[] args) {

//        String line = "this is nitin this is java developer";

        String line = "java dev";

        checkFrequency(line);
    }

    private static void checkFrequency(String line){

        Map<String,Long> map = Arrays.stream(line.split(""))
                .collect(Collectors.groupingBy(Function.identity() , LinkedHashMap::new , Collectors.counting()));

        System.out.println(map);

    }
}
