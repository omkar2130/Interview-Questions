package org.example.designpattern.singleton;

public class SingleTonDemo {
	
	//Lazy Loading
	private static SingleTonDemo obj=null;
	
	// Egar Loading
	//  private static SingleTonDemo obj=new SingleTonDemo();
	private SingleTonDemo() {}
	
	public static SingleTonDemo  getObj() {
		if(obj==null) {
			obj=new SingleTonDemo();
		}
		return obj;
	}

}
