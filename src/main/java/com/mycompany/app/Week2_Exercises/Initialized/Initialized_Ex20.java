package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex20 {
    public void yuu20() {
        temp("Hello,"+"Humans");
        temp(new String[]{"Monke","WANTS","BANANAS!"});

        String[] a={"Monke","REALLY","WANTS","BANANAS!"};
        temp(a);
    }

    static void temp(String...strg){
        for(String a:strg)System.out.print(a+" ");
        System.out.println();
    }
}