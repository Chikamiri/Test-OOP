package com.mycompany.app.Week2_Exercises;

public class Initialized_Ex17 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Monke[] E=new Monke[5];
        //ofc nothing is printed :pog:
    }
}
class Monke{
    Monke(String a){
        System.out.println(a);
    }
}
