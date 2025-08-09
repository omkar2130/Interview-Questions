package org.example.streamapi.StreamDemo;

import java.util.Arrays;

public class StramExample {
	
	public static void main(String args[]) {
	   String name="Hello World";
	   System.out.println( Arrays.stream(name.split("")).filter(x-> x=="l").count());
	}
}
