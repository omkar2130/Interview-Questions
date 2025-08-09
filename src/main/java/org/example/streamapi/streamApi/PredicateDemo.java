package org.example.streamapi.streamApi;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		// Predicate (Return Boolean value) and contain test method 
		
		int a=10;
		int b=3;
		Predicate<Integer> p =x-> x%2==0;
		Predicate<Integer> p1 =x-> x%2==0;
		
		Predicate<Integer> p3= p.and(p1);
		
		System.out.println(p.test(b));
		System.out.println(p3.test(a));

	}

}
