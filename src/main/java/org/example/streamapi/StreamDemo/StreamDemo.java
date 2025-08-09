package org.example.streamapi.StreamDemo;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
     public static void main(String args[]) {
    	 //Function<T, R>  --> it work for (return some value for you)  map use
    	//Consumer we can perform our logic Consumer<String> c= x -> System.out.println(x);
    	//Predicate (Return Boolean value we provide condition) and contain test method   filter
    	//Supplier always give which we have provided Supplier<String> supDemo = () -> "hello world";
    	 //process collection of data in a functional and declarative manner
    	 
    	 // what is stream 
    	 //--> a sequence of elements which support functional and declarative programming 
    	 String arr[]= {"A","B","C"};
    	 List<String> list=Arrays.asList(arr);
    	 
    	 Arrays.asList(arr).stream().forEach(System.out::println);
    	 
    	 Arrays.stream(arr);
    	 
    	 
    	 List<Integer> number =List.of(3,5,7,3,2,4,6,8);
    	 System.out.println(number.stream().filter(x-> x%2==0).collect(Collectors.toList()));
    	 System.out.println(number.stream().filter(x -> x%2==0).count());
    	 
    	 
    	 
    	 
    	 //Stream creation
    	 
    	 List<Integer> num =List.of(3,5,7,3,2,4,6,8);
    	 Stream<Integer> stream=num.stream();
    	 
    	 //From arrays
    	 
    	 String arr1[]= {"A","B","C"};
    	 
    	 Stream<String> stream1= Arrays.stream(arr1);
    	 
    	 
    	 //Using stream.of()
    	 
    	 Stream<String> stream2= Stream.of("A","B","C");
    	 
    	 
    	 //Infinite Stream 
    	 
    	 Stream<Integer> stream3= Stream.generate(()->1);
    	 
    	 Stream<Integer> stream4= Stream.generate(()->1).limit(100);
    	 
    	 Stream.iterate(1, x-> x+1);
    	System.out.println(Stream.iterate(1, x-> x+1).limit(100).collect(Collectors.toList()));
    	 
    	 
 		
     }
}


