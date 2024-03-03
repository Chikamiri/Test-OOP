package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex13 extends MethodE13 {
    void e13(char c){
        System.out.println("I_e13("+c+")");
    }
    public void kn13() {
        Reusing_Ex13 E13=new Reusing_Ex13();
        E13.e13();
        E13.e13(1);
        E13.e13(false);
        E13.e13('e');
    }
}

class MethodE13{
    void e13(){
        System.out.println("I_e13");
    }
    void e13(int i){
        System.out.println("I_e13("+i+")");
    }
    void e13(boolean b){
        System.out.println("I_e13("+b+")");
    }
}
