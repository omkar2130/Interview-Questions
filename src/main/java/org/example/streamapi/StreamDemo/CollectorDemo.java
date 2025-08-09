package org.example.streamapi.StreamDemo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemo {
	
	public static void main(String args[]) {
		// Collectors is utility class 
		// provide a set of methods to create common collection
		
		List<String> name= Arrays.asList("A","B","C","A","F","G","S","E","D","E","B","B");
		List<Integer> num=List.of(1,2,3,4,5,6,1,1,1,1);
		
		//joining join the list in single String
		
		    name.stream().collect(Collectors.joining(" ")).chars().forEach(x-> System.out.print((char)x));
		    String allName= name.stream().collect(Collectors.joining(" "));
		    System.out.println(allName);
		    
		    //summarizing Data
		    //Generated statistical summary (COUNT SUM MIN AVG MAX)
		    
		    IntSummaryStatistics op = num.stream().collect(Collectors.summarizingInt(x->x));
		    System.out.println("SUM= "+op.getSum());
		    System.out.println("COUNT= "+op.getCount());
		    System.out.println("AVG="+op.getAverage());
		    System.out.println("MAX= "+op.getMax());
		    System.out.println("MIN= "+op.getMin());
		    
		    System.out.println(num.stream().collect(Collectors.averagingInt(x->x)));
		    System.out.println(num.stream().collect(Collectors.counting()));
		    System.out.println(name.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));
		    System.out.println(num.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));
             

		    

			
		
	}

	
}
