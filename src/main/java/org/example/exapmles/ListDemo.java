package org.example.exapmles;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        // Example of using a List in Java
      /*  List<String> arraylist = new ArrayList<>();
        arraylist.add("Aaherry"); arraylist.add("Apple");arraylist.add("Banana");

        // Print the Array list
        System.out.println("List contents: " + arraylist.get(0));
        System.out.println("List contents: " + arraylist);


        List<String> linedlist = new LinkedList<>();
        linedlist.add("KK");linedlist.add("Banana");linedlist.add("Cherry");
        // Print the Linked list
        System.out.println("List contents: " + linedlist.get(1));
        System.out.println("List contents: " + linedlist);
        String s = linedlist.stream().skip(1).findFirst().get();
        System.out.println(s);*/

         String name="Omkar Surykant Kotkar";
     Map<String,Long> ss=Arrays.stream(name.replace(" ","").split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     System.out.println(ss);
        List<Long> list = ss.values().stream().map(x -> x * x).toList();
        System.out.println(list);
    }
}
