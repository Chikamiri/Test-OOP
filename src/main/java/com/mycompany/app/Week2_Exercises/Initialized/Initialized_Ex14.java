package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex14 {
    public void yuu14 () {
        Help.invasion();
        //So, variables must be initialized 
            //before they are used.
    }
}

class Help{
    static String animal="cats";
    static String location;
    static{
        location="Earth";
    }

    static void invasion(){
        System.out.println(
            "The "+animal+"' invasion occur in "+location
        );
    }
}