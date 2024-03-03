package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex16 {
    public static void main(String[] args) {
        Frog pepe=new Frog();
        Amphibian better_pepe=(Amphibian) pepe;//Upcast

        better_pepe.game();
        better_pepe.Dr();
    }
}

class Amphibian{
    public void game(){
        System.out.println("Amphibian gaeming");
    }
    public void Dr(){
        System.out.println("Dr.Amphibian");
    }
}
class Frog extends Amphibian{
    //idk, more method?
}