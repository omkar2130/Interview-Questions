package org.example.exapmles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Demo {
    public static void main(String args[]){
        Map<String, Integer> map=new HashMap<>();
        map.put("string",21);
        map.put("string1",21);
        map.put("string2",21);
        map.put("string2",21);
        for(Map.Entry<String,Integer> m: map.entrySet()) {
          //  System.out.println(m.getValue());
        }
       List<Map.Entry<String, Integer>> string1 = map.entrySet().stream().filter(x -> x.getKey().equals("string1")).toList();
        map.entrySet().stream().map(x -> ("string1".equals(x.getKey())) ? x.getValue() : 0).
          forEach(x->System.out.println(x));


    }
}
