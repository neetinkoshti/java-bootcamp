package ntn.com.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class LRUCache {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A","B","C","D","E","A","C","F","G","B");

        System.out.println(lruCache(stringList));
    }

    private static String lruCache(List<String> stringList) {

        Set<String> lruCacheSet = new LinkedHashSet<>();

        stringList.stream().forEach(str -> {
            if(lruCacheSet.contains(str)){
                lruCacheSet.remove(str);
            }else if (lruCacheSet.size() == 5 ){

                Iterator itr = lruCacheSet.iterator();
                itr.next();
                itr.remove();
            }else{
                lruCacheSet.add(str);
            }
        });

        return lruCacheSet.stream().collect(Collectors.joining("-"));
    }
}
