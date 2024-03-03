package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex4 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        temp2 E=new temp2();
        temp2 A=new temp2("ger");
    }
}
class temp2{
    temp2(){
        System.out.println("Pog");
    }
    temp2(String s){
        System.out.println("Pog"+s);
    }
}
