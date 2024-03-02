package com.mycompany.app.Week2_Exercises;

public class Initialized_Ex18 {
    public static void main(String[] args) {
        Monke[] Banana=new Monke[5];
        for(int i=0;i<5;i++){
            Banana[i]=new Monke(Integer.toString(i));
        }
    }
}
class Monke{
    Monke(String a){
        System.out.println(a);
    }
}