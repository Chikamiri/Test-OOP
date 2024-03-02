package com.mycompany.app.Week2_Exercises;

public class Initialized_Ex2 {
    public static void main(String[] args) {
        t E=new t("completely random text");
        //text to b, nothing for a
        System.out.println(E.a);
        System.out.println(E.b);
    }
}
class t{
    String a,b;
    t(String c){b=c;}
}
