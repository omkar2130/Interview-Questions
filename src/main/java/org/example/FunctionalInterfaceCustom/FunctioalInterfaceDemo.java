package org.example.FunctionalInterfaceCustom;


@FunctionalInterface
interface LamdaDemo{
    int add(int a, int b);
}

public class FunctioalInterfaceDemo {
    public static void main(String args[]){
        LamdaDemo test= (a,b)-> { return a+b; };
        System.out.println(test.add(10,20));
    }
}
