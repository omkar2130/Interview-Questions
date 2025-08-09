package org.example.streamapi.streamApi;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String args[]) {
		
		// Consumer we can perform our logic
		
		Consumer<String> c= x -> System.out.println(x);
		
		c.accept("Omkar");
		
		
		List<Integer> list=List.of(2,4,5,6,7,9,3);
		
		Consumer<List<Integer>> c1= x ->{
			for(int a: x) {
				System.out.println(a);
			}
		};
		
		c1.accept(list);
				
	}

}
