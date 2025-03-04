package com.ntn.intws;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {

        execute();
    }

    public static void execute(){
        HashSet<Short> set = new HashSet<>();
        for(short i=0 ; i< 100;i++){
            set.add(i);
            set.remove(i-1);
        }
        System.out.println(set.size());
    }
}
