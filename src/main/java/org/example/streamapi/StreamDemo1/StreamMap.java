package org.example.streamapi.StreamDemo1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
	      Map<String, Integer> scores = Map.of("Alice", 80, "Bob", 95, "Charlie", 90, "Ram" , 92);
            
	   List<Map.Entry<String,Integer>> ll= scores.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
			                   .limit(2).collect(Collectors.toList());
	   System.out.println(ll);
	}

}
