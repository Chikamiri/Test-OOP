package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex17 {
    public void kn17() {
        FrogE17 pepe=new FrogE17();
        AmphibianE17 best_pepe=(AmphibianE17) pepe;

        best_pepe.gameE17();
        best_pepe.DrE17();
    }
}

class AmphibianE17{
    public void gameE17(){
        System.out.println("Amphibian gaeming");
    }
    public void DrE17(){
        System.out.println("Dr.Amphibian");
    }
}
class FrogE17 extends AmphibianE17{
    @Override
    public void gameE17() {
        System.out.println("Lord Amphibian gaeming");
    }

    @Override
    public void DrE17() {
        System.out.println("Super Amphibian");
    }
}