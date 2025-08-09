package org.example.defaultstatic;

public class MainClass implements Test1,Test2{
    @Override
    public void Methodtest1() {
        Test1.super.Methodtest1();
        Test2.super.Methodtest1();
    }

    public static void main(String args[]){
        MainClass mc=new MainClass();
        mc.Methodtest1();
    }
}
