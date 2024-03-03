package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex6 {
    @SuppressWarnings("unused")
    public void yuu6() {
        Doggo human=new Doggo(3, 6.9);
        Doggo magic=new Doggo(3.5,2);
    }
}

class Doggo{
    Doggo(int n, double m){
        System.out.println(
            "Doggo barks "+n+" times and walks "+m+" metres!"
        );
    }
    Doggo(double n, int m){
        System.out.println(
            "Doggo casts *Pog Aura*.It costs "+n+
            "MP and he uses it "+m+" times."
        );
    }
    //same with other data types(float, char, etc...)
}