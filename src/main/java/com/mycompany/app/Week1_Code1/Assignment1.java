package com.mycompany.app.Week1_Code1;

public class Assignment1 {
    public void dk1(){
        Number n1 = new Number();
        Number n2 = new Number();
        
        n1.i = 2;
        n2.i = 5;
        n1.i = n2.i;
        System.out.println(n1.i);

        n2.i = 10; // what is n1.i?
    }
}
