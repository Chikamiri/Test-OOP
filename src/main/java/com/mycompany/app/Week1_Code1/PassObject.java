package com.mycompany.app.Week1_Code1;

public class PassObject {
    static void f(Number m){
        m.i=15;
    }
    public void dk3(){
        Number n = new Number();
        n.i = 14;
        f(n);
    }
}
