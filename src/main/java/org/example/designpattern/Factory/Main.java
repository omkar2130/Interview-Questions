package org.example.designpattern.Factory;

public class Main {
      public static void main(String args[]) {
    	  Shape s=FactoryClass.getObj("Trangle");
    	  s.draw();
      }
}
