package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex19 {
    public void yuu19 () {
        temp("a","b","eeeeeee");
        System.out.println();
        temp(new String[]{"Monke","WANTS","BANANAS!"});
    }
    static void temp(String...strg){
        for(String a:strg)System.out.println(a);
    }
}