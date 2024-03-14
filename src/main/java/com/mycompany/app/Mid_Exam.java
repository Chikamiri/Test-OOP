package com.mycompany.app;
//Mid_Exam
import java.util.Random;

public class Mid_Exam {
    public static void main(String[] args) {
        Instrument[] instruments = { new Wind(), new Percussion(), new Stringed(), new Woodwind(), new Brass() };

        for (Instrument instrument : instruments) {
            System.out.println(instrument.what());
            instrument.play();
            System.out.println("");
        }
        // Câu 2.3
        instruments[4].adjust();
    }
}

abstract class Instrument {
    String what() {
        return "Instrument";
    }

    abstract void play();

    abstract void adjust();
}

class Wind extends Instrument {
    String what() {
        return "Wind";
    }

    void play() {
        Tune.tune("Wind");
    }

    void adjust() {

    }
}

class Percussion extends Instrument {
    String what() {
        return "Percussion";
    }

    void play() {
        Tune.tune("Percussion");
    }

    void adjust() {

    }
}

class Stringed extends Instrument {
    String what() {
        return "Stringed";
    }

    void play() {
        Tune.tune("Stringed");
    }

    void adjust() {

    }
}

// Extends Wind
class Woodwind extends Wind {
    String what() {
        return "Woodwind";
    }

    void play() {
        Tune.tune("Woodwind");
    }

    void adjust() {
    }
}

class Brass extends Wind {
    String what() {
        return "Brass";
    }

    void play() {
        Tune.tune("Brass");
    }

    void adjust() {
        System.out.println("Adjust Brass");
        Tune.tune("Brass(Adjusted)");
    }
}

// Tune
class Tune {
    public static String[] note = { "A", "B", "Middle_C", "D", "E", "F", "G" };

    public static void tune(String temp) {
        if (temp.equals("Wind") || temp.equals("Percussion") || temp.equals("Stringed")) {
            System.out.println("Playing " + temp + " at note " + note[2]);
        } // Câu 2.2 yêu cầu chỉnh việc play ở nút Middle_C nên dùng .equals?
        else if (temp.equals("Brass(Adjusted)"))
            System.out.println("Playing " + temp + " at note " + note[RandomTune()]);
        else
            System.out.println("Can't play!!");
    }

    public static int RandomTune() {
        Random rand = new Random();
        int randomNote = rand.nextInt(7);
        return randomNote;
    }
}