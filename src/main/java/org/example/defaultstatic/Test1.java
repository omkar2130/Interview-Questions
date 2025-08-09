package org.example.defaultstatic;

public interface Test1 {
    default void Methodtest1(){
        System.out.println("Interface 1 default method");
    }
    static void methodtest2(){
        System.out.println("Interface 1 static method");
    }


}
