package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex15 {
    public static void main(String[] args) {
        new Gimpact();
    }
}
class Gimpact{
    String s;
    {
        s="Enshin";
        System.out.println(s);
    }
}