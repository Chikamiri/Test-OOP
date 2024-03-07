package com.mycompany.app.Week2_Exercises.Polymorphism;

public class Poly_Ex17 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{ new Unicycle(), new Tricycle(), new Bicycle() };
        ((UnicycleEx17)cycles[0]).balance();
        ((BicycleEx17)cycles[1]).balance();
    }
}
class UnicycleEx17 extends Cycle {
    public void balance(){}
}
class BicycleEx17 extends Cycle {
    public void balance(){}
}
    

