package com.mycompany.app.Week2_Exercises.Polymorphism;

import java.util.Random;


public class Poly_Ex6_7_8 {  
    public static void tune(Instrument i) {
        Note note = new Note();
        Random rand = new Random();
        int randomNote = rand.nextInt(7);
        i.play(note, randomNote);
    }

    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }


    public static void toString(Instrument[] i) {
        for (Instrument instrument : i) {
            System.out.println(instrument.what());
        }
    }
  
}
class Note{
    char[] note = {'D', 'R', 'M', 'F', 'S', 'L', 'S'};
    public Note() {
    
}
    }

class random{

}
class Instrument{
    public void play(Note n, int i) {
        System.out.println("Instrument.play() - " + n.note[i]);
    }

    public String what() {
        return "Instrument";
    }

    public void adjust() {
        System.out.println("Adjusting Instrument");
    }
}