package com.mycompany.app.Week3_Code;

import java.util.*;

public class DisruptLecture {
    //App.java
    //DisruptLecture temp2 = new DisruptLecture();
    //temp2.testDisrupt();
    public void testDisrupt() {
        Cellphone noiseMaker = new Cellphone();
        /*
         * Tune t1=new Tune();
         * Tune t2=new ObnoxiouTune();
         */

        // noiseMaker.ring(t1);
        // !noiseMaker.ring((ObnoxiouTune)t1);
        // noiseMaker.ring((Tune)t2);
        // noiseMaker.ring((ObnoxiouTune)t2);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of tunes: ");
        int numTunes = keyboard.nextInt();
        Tune[] tunes = new Tune[numTunes];

        for (int i = 0; i < numTunes; i++) {
            System.out.println("Enter tune type");
            System.out.println("(Tune=1, ObnoxiousTune=2, NiceTune=3)");
            int tuneType = keyboard.nextInt();
            switch (tuneType) {
                case 1:
                    tunes[i] = new Tune();
                    break;
                case 2:
                    tunes[i] = new ObnoxiouTune();
                    break;
                case 3:
                    tunes[i] = new NiceTune();
                    break;
                default:
                    tunes[i] = new Tune();
                    break;
            }
        }
        System.out.println("");
        for (int i = 0; i < tunes.length; i++)
            noiseMaker.ring(tunes[i]);
        keyboard.close();
    }
}

class Cellphone {
    Cellphone() {
    }

    public void ring(Tune t) {
        t.play();
    }
}

class Tune {
    Tune() {
    };

    public void play() {
        System.out.println("Tune.play()");
    }
}

class ObnoxiouTune extends Tune {
    ObnoxiouTune() {
    }

    public void play() {
        System.out.println("ObnoxiousTune.play()");
    }
}
//public
class NiceTune extends Tune{
    NiceTune(){}
    public void play(){
        System.out.println("NiceTune.play()");
    }
}