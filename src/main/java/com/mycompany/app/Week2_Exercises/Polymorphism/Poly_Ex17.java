package com.mycompany.app.Week2_Exercises.Polymorphism;

public class Poly_Ex17 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{ new Unicycle(), new Tricycle(), new Bicycle() };
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
    }
}
class Unicycle extends Cycle {
    public void balance(){}
}
class Bicycle extends Cycle {
    public void balance(){}
}
    

