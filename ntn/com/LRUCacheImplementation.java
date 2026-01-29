package com.ntn.intws;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class LRUCacheImplementation {

    public static void main(String[] args) {
        String[] str = {"A","B","C","D","E","A","C","F","G","B"};
        System.out.println(lRUCache(str));

        System.out.println(lRUCacheUsingJava8(str));
    }

    private static String lRUCacheUsingJava8(String[] str){

        LinkedHashSet<String> cache = new LinkedHashSet<>(5);

        Arrays.stream(str).forEach(s -> {
            if(cache.contains(s)){
                cache.remove(s);
            }else if(cache.size() ==5){

                Iterator itr = cache.iterator();
                itr.next();
                itr.remove();
            }
            cache.add(s);
        });

        return cache.stream().collect(Collectors.joining("-"));
    }

    private static String lRUCache(String[] str){

        LinkedHashSet<String> cache = new LinkedHashSet<>(5);
        for(String s : str){

            if(cache.contains(s)){
                cache.remove(s);
            }else if(cache.size() ==5){

                Iterator itr = cache.iterator();
                itr.next();
                itr.remove();
            }

            cache.add(s);
        }

        return cache.stream().collect(Collectors.joining("-"));
    }
}
