package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex18 {
    public void yuu18() {
        Monkee[] Banana=new Monkee[5];
        for(int i=0;i<5;i++){
            Banana[i]=new Monkee(Integer.toString(i));
        }
    }
}
class Monkee{
    Monkee(String a){
        System.out.println(a);
    }
}