package org.example.exapmles;


public class ShalloDeepCopyDemo {
    String name;
    int age;
    ShalloDeepCopyDemo(){

    }
    ShalloDeepCopyDemo(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void  main(String args[]){

        ShalloDeepCopyDemo obj=new ShalloDeepCopyDemo("Omkar",21);

        //shallow copy
        ShalloDeepCopyDemo obj1=obj;

        //deep copy
        ShalloDeepCopyDemo obj2=new ShalloDeepCopyDemo();
        obj2.name=obj.name;
        obj2.age=obj.age;



        System.out.println("Obj:     Name : "+obj.name+" Age : "+obj.age );

        System.out.println("Obj1     Name : "+obj1.name+" Age : "+obj1.age );



        System.out.println("After Operation on Obj1");

        obj1.name="Shallo Copy";
        obj1.age=66;
        System.out.println("Obj:     Name : "+obj.name+" Age : "+obj.age );

        System.out.println("Obj1     Name : "+obj1.name+" Age : "+obj1.age );

    }
}
