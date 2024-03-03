package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex10 {
    public void yuu10() {
        Fin uwu=new Fin();
        uwu.tempEx10((float)3.14);//Change default value
        new Fin();//nothing on output cuz default value not 0
    }
}

class Fin{
    int i=0;//Default
    public void tempEx10(float a){
        i=i+(int)a;
    }
    protected void finalize(){//Finalizer, but nothing happened due to the default value is not 0
        if(i==0)System.out.println("Bruh no.");
    }
}