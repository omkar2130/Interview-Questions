package org.example.designpattern.BuilderPattern;

public class Main {
	
	public static void main(String args[]) {
		User user=new User.UserBuilder().setName("Omkar").setLastName("Kotkar").setAddress("Pune").build();
		System.out.println(user.toString());
	}

}
