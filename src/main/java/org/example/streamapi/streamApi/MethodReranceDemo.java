package org.example.streamapi.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MobilePhone{
	String name;
	public MobilePhone(String name) {
		this.name=name;
		
	}
}

public class MethodReranceDemo {
	
	// Method Reference :-> use method without invoking & in place of lambda expression
	
	public static void main(String args[]) {
		
	
	List<String> nameList=List.of("Ram","Sham","Ghansham");
	
	//using lambda expression
	
	nameList.forEach(x-> System.out.println(x));
	
	//using method reference
	
	nameList.forEach(System.out::println);
	
	
	//Contructor reference
	
	List<String> mobileName= Arrays.asList("A","B","C","D");
	
	//using lambda expression
	
	List<MobilePhone> mobilePhone= mobileName.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
	
	//Using Contructor reference
	
	List<MobilePhone> mobilePhone1= mobileName.stream().map(MobilePhone::new).collect(Collectors.toList());

		
	
	}
	
	
	
}
