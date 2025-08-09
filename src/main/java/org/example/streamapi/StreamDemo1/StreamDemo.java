package org.example.streamapi.StreamDemo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String args[]) {
		
	
	List<Employe> emp = Arrays.asList(
			new Employe("A","A+",2109l,"21/09/1979",26),
			new Employe("B","B+",2110l,"14/02/1996",23),
			new Employe("C","O+",2111l,"19/04/1991",21),
			new Employe("D","AB+",2112l,"25/06/2000",25),
			new Employe("A","A-",2113l,"24/07/2002",21)
			);
	System.out.println(emp.stream()
		.collect(Collectors.groupingBy(Employe::getName,Collectors.averagingDouble(Employe::getAge))));
     
	}
}
