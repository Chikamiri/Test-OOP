package com.mycompany.app.Week2_Exercises;

public class Initialized_Ex13 {
    public static void main(String[] args) {
        System.out.println("Inside main");
        
        //Cups.cup1.f(99);
    }
    static Cups cups1=new Cups();
    //static Cups cups2=new Cups();
    /*Output:
        Cup(1)
        Cup(2)
        Cups()
        Inside main
    Well it's true :P           */
}

class Cup{
    Cup(int marker){
        System.out.println("Cup("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}
class Cups{
    static Cup cup1,cup2;
    static{
        cup1=new Cup(1);
        cup2=new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}