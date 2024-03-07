package com.mycompany.app.Week2_Exercises.Polymorphism;

public class Poly_Ex9 {

    public static void main(String[] args) {
        Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };

        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.sleep();
            System.out.println(rodent);
        }
    }

    public class RodentTest {
        @Override
        public String toString() {
            return "Rodent";
        }
    }

}

class Rodent {
    protected void eat() {
        System.out.println("Rodent is nibbling");
    }

    protected void sleep() {
        System.out.println("Rodent is curled up sleeping");
    }
}

class Mouse extends Rodent {
    @Override
    protected void eat() {
        System.out.println("Mouse is gnawing on cheese");
    }
}

class Gerbil extends Rodent {
    @Override
    protected void eat() {
        System.out.println("Gerbil is munching on seeds");
    }
}

class Hamster extends Rodent {
    @Override
    protected void sleep() {
        System.out.println("Hamster is hibernating");
    }
}