package org.example.designpattern.BuilderPattern;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String args[]) {
		User user=new User.UserBuilder().setName("Omkar").setLastName("Kotkar").build();
		System.out.println(user.toString());

		int [] arr={1,3,5,3,3,4,5,4,4,2,4,7};

		Integer secondMostFrequent = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Map.Entry.<Integer, Long>comparingByValue(Comparator.reverseOrder()))
				.skip(1) // Skip the most frequent
				.findFirst()
				.map(Map.Entry::getKey)
				.orElse(null);

		System.out.println(secondMostFrequent);

	}

}
