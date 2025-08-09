package org.example.ImmutableClass;

public final class MyImmutable {
	
	private final String name;
	private final int age;
	 public MyImmutable(String name, int age) {
	       this.name=name;
	       this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	 

}
