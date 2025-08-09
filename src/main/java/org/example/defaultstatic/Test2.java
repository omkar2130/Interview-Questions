package org.example.defaultstatic;

public interface Test2 {
    default void Methodtest1(){
        System.out.println("Interface 2 default method");
    }
    static void methodtest2(){
        System.out.println("Interface 2 static method");
    }
}
