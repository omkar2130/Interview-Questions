package org.example.streamapi.StreamDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOpsDemo {
	
	//Function<T, R>  --> it work for (return some value for you)  map use
	//Consumer we can perform our logic Consumer<String> c= x -> System.out.println(x);
	//Predicate (Return Boolean value we provide condition) and contain test method   filter
	//Supplier always give which we have provided Supplier<String> supDemo = () -> "hello world";

	public static void main(String[] args) {
		
		//Intermediate Operation Transform stream into another stream
		// They are lazy, meaning they don't execute until a terminal operation in invoked
		
		List<String> name= List.of("Omkar","Ram","Sham","Tushar","Ankit","Ankit");
		
		
		// 1.filter
		Stream<String> startWithA=name.stream().filter(x -> x.startsWith("A"));
		
		System.out.println(startWithA);
		
		// 2.Map
		
		Stream<String> upperCase= name.stream().map(x-> x.toUpperCase());
		
		// Sorted (natural order)
		
		Stream<String> sorted= name.stream().sorted();
		
		// Sorted with comparator
		
		Stream<String> sortedWithCustomComparator= name.stream().sorted((a,b)-> a.length() -b.length());
		
		//distinct
		
		System.out.println( name.stream().filter(x-> x.startsWith("A")).distinct().count());
		
		// skip
		
		System.out.println(name.stream().filter(x -> x.endsWith("m")).skip(1).collect(Collectors.toList()));
		
		
		//findFirst
		String n=name.stream().filter(x -> x.endsWith("m")).findFirst().get();
		
		//peek which is same as forEach but forEach is terminal op and peek is intermediate op 
		
		Stream.iterate(1, x->x+1).limit(100).peek(System.out::println).count();
		
		//flatMap   handle Stream of collection, list or arrays where each element is itself collection
		// flatten nested structure (e.g list within list) so that they can be process as a single sequence of element
		// transform and flatten elements at same time 
		
		List<List<String>> listOfList= List.of(
				   Arrays.asList("A","B"), Arrays.asList("C","D"), Arrays.asList("E","F")
				);
		
		listOfList.stream().flatMap(x->x.stream()).forEach(System.out::println);
		
		
		List<String> list=Arrays.asList("Hello World", "Java Streams are powerful", "Flat Map is useful");
		        list.stream()
		        .flatMap(x-> Arrays.stream(x.split(" ")))
				.map(x->x.toUpperCase())
				.collect(Collectors.toList())
				.forEach(System.out::print);

	

	}

}
