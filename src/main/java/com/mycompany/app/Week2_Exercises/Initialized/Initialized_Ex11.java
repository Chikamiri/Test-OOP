package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex11 {
    public static void main(String[] args) {
        tempEx11 uwu=new tempEx11();
        uwu.temp((float)3.14);//Change default value
        new tempEx11();//nothing on output cuz default value not 0

        //Need these codes to print Trash collector method "Finalize"
        System.gc();//Collect trashhhh
        System.runFinalization();//Finalization
    }
}

class tempEx11{
    int i=0;//Default
    public void temp(float a){
        i=i+(int)a;
    }
    protected void finalize(){//Finalizer, but nothing happened due to the default value is not 0
        if(i==0)System.out.println("Bruh no.");
    }
}