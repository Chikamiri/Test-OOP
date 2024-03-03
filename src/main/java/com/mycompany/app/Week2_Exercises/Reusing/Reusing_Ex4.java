package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex4 extends Manga{
    public Reusing_Ex4(){
        System.out.println("Low rating exercise");
    }
    public void kn4() {
        new Reusing_Ex4();
    }
}
class Manga{
    Manga(){
        System.out.println("High rating manga");
    }
}