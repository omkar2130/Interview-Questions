package org.example.streamapi.streamApi;

import java.util.function.Supplier;

public class SupplierDemo {
	
	// always give which we have provided
	
	public static void main(String args[]) {
	
		Supplier<String> supDemo = () -> "hello world";
		
		System.out.println(supDemo.get());
		
	}

}
