package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex2 {
    public void yuu2() {
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
