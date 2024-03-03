package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex24 extends Beetle{
    private int bug=printInit("Reusing_Ex24.bug initialized");
    public Reusing_Ex24(){
        System.out.println("bug = " + bug);
        System.out.println("j = " + j);
    }

    @SuppressWarnings("unused")
    private static int x3=printInit("static Reusing_Ex24.bug Initialized");
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Reusing_Ex24 constructor");
        new Reusing_Ex24();
    }
}

class Beetle extends Insect {//Beetle
    private int k=printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    @SuppressWarnings("unused")
    private static int x2=printInit("static Beetle.x2 initialized");
}

class Insect{
    private int i=9;
    protected int j;
    Insect(){
        System.out.println("i = " + i + ", j = " + j); 
        j = 39;
    }

    @SuppressWarnings("unused")
    private static int x1=printInit("static Insect.x1 initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}