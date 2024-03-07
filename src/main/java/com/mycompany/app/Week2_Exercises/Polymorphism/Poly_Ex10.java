package com.mycompany.app.Week2_Exercises.Polymorphism;

public class Poly_Ex10 {
    public static void main(String[]args){
        Base10 derived=new Derived();
        derived.methodex10();
    }
}

class Base10{
    public void methodex10(){
        System.out.println("Base10");
        methodex10();
    }
    public void methodex10_2(){
        System.out.println("Base10");
    }
}
class Derived extends Base10{
    @Override
    public void methodex10_2(){
        System.out.println("DerivedClass");
    }
}
