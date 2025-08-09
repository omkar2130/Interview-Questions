package org.example.streamapi.StreamDemo;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreamDemo {
      //a type of stream that enable parallel processing of element 
	  //Allowing multiple thread to process parts of the stream simultaneously 
	  //this can significantly improve performance for large data set
	  //Parallel streams are mostly effective for large datasets where task are independent  
	
       public static void main(String args[]) {
    	   List<Integer> num=Stream.iterate(0, x-> x+1).limit(20000).toList();

    	  long st= System.currentTimeMillis();
    	   List<Integer> facto=num.stream().map(x-> fact(x)).toList();
    	   long et=System.currentTimeMillis();
    	   System.out.println(et-st);
    	   
    	    st= System.currentTimeMillis();
    	   List<Integer> factc=num.parallelStream().map(x-> fact(x)).toList();
    	    et=System.currentTimeMillis();
    	   System.out.println(et-st);
    	   
    	   // cumulative sum
    	   //[1,2,3,4,5] --> [1,3,6,10,15]
           AtomicInteger sum= new AtomicInteger(0);
    	   Stream.of(1,2,3,4,5).map(x-> sum.addAndGet(x)).toList();
    	      
       }
     
       static Integer fact(int x) {
			int fact = 1;
			while (x > 0)
				fact = fact * x--;
			return fact;
		}
}
