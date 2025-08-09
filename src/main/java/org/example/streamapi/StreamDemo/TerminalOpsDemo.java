package org.example.streamapi.StreamDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOpsDemo {

	public static void main(String[] args) {
		
		//Function<T, R>  --> it work for (return some value for you)  map use
		//Consumer we can perform our logic Consumer<String> c= x -> System.out.println(x);
		//Predicate (Return Boolean value we provide condition) and contain test method   filter
		//Supplier always give which we have provided Supplier<String> supDemo = () -> "hello world";
		
		List<Integer> list= Arrays.asList(1,2,3,5,6,4,3,7);
		List<String> name= List.of("Omkar","Ram","Sham","Tushar","Ankit","Ankit");
		// Collect  toList toArray  get
		      list.stream().skip(2).collect(Collectors.toList());
		      list.stream().skip(1).toList();
		      Object[] a1= name.stream().skip(1).toArray();
		      list.stream().skip(1).findFirst().get();
		      list.stream().forEach(x->{System.out.println(x);});
		
		  //reduce combines element to produce single result
		      
		   Integer value=   list.stream().reduce((x,y)-> x+y).get();
		   
		 //Count
		   Long count=list.stream().count();
		  
		   // anyMatch allMatch nonMatch
		   // checking in all the list condition is satisfied or not
		   
		   boolean b=list.stream().anyMatch(x->x%2==0);
		   System.out.println(b);

		   // checking all the elements in the list satisfied the condition 
		   boolean b1= list.stream().allMatch(x-> x%2==0);
		   System.out.println(b1);

		   // checking all the elements should match the condition
		   boolean b2= list.stream().noneMatch(x-> x < 0 );
		   System.out.println(b2);

		   // findAny findFirst
		   
		   System.out.println(list.stream().findAny().get());
		   System.out.println(list.stream().findFirst().get());
		   
		   // toArray which is used to convert into any stream into array 
		   
		  Object[] arr= Stream.of(1,2,3,4,5,6).toArray();
		  
		  // min and max
		  
		  Stream.of(1,2,4,5,6,7,4,0).min(Comparator.naturalOrder()).ifPresent(System.out::println);
		  Stream.of(1,235,54,3,6,3,24,4).max((s,d)->s-d).ifPresent(System.out::println);
		         

	}

}
