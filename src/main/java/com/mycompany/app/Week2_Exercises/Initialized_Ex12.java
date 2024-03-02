package com.mycompany.app.Week2_Exercises;

public class Initialized_Ex12 {
    public static void main(String[] args) {
        Tank BIG=new Tank();
        System.out.println("Tank filled? "+BIG.filled);
    
        BIG.fill();
        System.out.println("Tank filled? "+BIG.filled);
        System.gc();
        //System.runFinalization();
        //Filled tank marked for garbage collection

        new Tank();
        System.out.println("Still filled? "+BIG.filled);
        
        BIG.empty();
        System.out.println("Now empty? "+BIG.filled);
        System.gc();
        //No message, tank is empty
    }
}

class Tank{
    boolean filled=false;
    public void fill(){
        filled=true;
    }
    public void empty(){
        filled=false;
    }
    protected void finalize(){
        if(filled)System.out.println("Here, a tank full of nothing.");
    }
}