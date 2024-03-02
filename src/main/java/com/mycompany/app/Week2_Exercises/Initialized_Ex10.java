package com.mycompany.app.Week2_Exercises;

public class Initialized_Ex10 {
    public static void main(String[] args) {
        Fin uwu=new Fin();
        uwu.temp((float)3.14);//Change default value
        new Fin();//nothing on output cuz default value not 0

        //Ye need these codes to print Trash collector method "Finalize"
        System.gc();//Collect trashhhh
        System.runFinalization();//Finalization
    }
}

class Fin{
    int i=0;//Default
    public void temp(float a){
        i=i+(int)a;
    }
    protected void finalize(){//Finalizer, but nothing happened due to the default value is not 0
        if(i==0)System.out.println("Bruh no.");
    }
}