package org.example.streamapi.streamApi;

import java.util.function.Function;

public class FunctionDemo {
	
 public static void main(String args[]) {
	 
  // Function<T, R>  --> it work for (return some value for you)
	
  Function<Integer, Integer> f = x -> x*2 ;
  
   System.out.println(f.apply(10));
   
   // return same values
   
   Function<Integer,Integer> identity= Function.identity();
   
   System.out.println(identity.apply(4));
   
 }
 
  
}
