package com.mycompany.app.Week2_Exercises.Polymorphism;

public class Poly_Ex1 {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Cycle uniCycle = new Unicycle();
        Cycle tricycle = new Tricycle();
        Cycle bicycle = new Bicycle();

        cycle.ride();
        uniCycle.ride();
        tricycle.ride();
        bicycle.ride();
    }
}

class Cycle {
    void ride() {
        System.out.println("Cycle");
    }

}

class Unicycle extends Cycle {
    void ride() {
        System.out.println("Unicycle");
    }
}

class Bicycle extends Cycle {
    void ride() {
        System.out.println("Bicycle");
    }
}

class Tricycle extends Cycle {
    void ride() {
        System.out.println("Tricycle");
    }
}
