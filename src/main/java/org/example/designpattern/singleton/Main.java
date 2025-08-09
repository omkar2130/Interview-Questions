package org.example.designpattern.singleton;

public class Main {
   public static void main(String args[]) {
	  SingleTonDemo d= SingleTonDemo.getObj();
	  System.out.println(d.hashCode());
	  SingleTonDemo d1= SingleTonDemo.getObj();
	  System.out.println(d1.hashCode());
   }
}
