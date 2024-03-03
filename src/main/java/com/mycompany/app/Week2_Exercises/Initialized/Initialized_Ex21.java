package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex21 {
    public enum Mood{
        happy, sad, angry, motivated, cunny
    }
    public void yuu21() {
        for(Mood temp:Mood.values()){
            System.out.println("Status: "+temp+
                ", ordinal: "+temp.ordinal());
        }
    }
}
