package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        int [] keys  =  {1, 2, 3, 4, 5, 6, 7};
        String [] values  =  {"A", "B", "B", "C", "B", "D", "C"};

        System.out.println(demo(keys,values));

    }

    public static Map<String, List<Integer>> demo(int[] key , String[] values) {

        Map<String, List<Integer> > inMap = new HashMap<>();
        for(int i=0 ; i < key.length ; i++) {
            String value = values[i];
            int k = key[i];

            inMap.computeIfAbsent(value, x -> new ArrayList<>()).add(k);
        }
        return inMap;

            }

}