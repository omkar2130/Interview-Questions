package org.example.designpattern.Factory;

public class FactoryClass {

	public static Shape getObj(String s){
		   
		if( s=="Circle") {
			return new Circle();
		}else if(s=="Trangle") {
			return new Trangle();
		}
		return null;
	}
	
	
}
