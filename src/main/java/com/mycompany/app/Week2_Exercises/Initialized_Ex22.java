package com.mycompany.app.Week2_Exercises;
import com.mycompany.app.Week2_Exercises.Initialized_Ex21.*;

public class Initialized_Ex22 { 
    
}

class Switch{
    public void temp(Mood a){
        switch (a) {
            case happy:
                System.out.println("Happy cat");
                break;
            case sad:
                System.out.println("Sad cat");
                break;
            case angry:
                System.out.println("HELP OUR CAT IS HOLDING A KNIFE!!!");
                break;
            case motivated:
                System.out.println(
                    "Cat is the storm that is approachinggg."
                );break;
            case cunny:
                System.out.println("[FILTERRED]");
                break;
            default:
                System.out.println("Too bad. U don't have a cat!");
                break;
        }
    }
}