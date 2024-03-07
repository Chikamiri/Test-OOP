package com.mycompany.app.Week2_Exercises.Polymorphism;

public class Poly_Ex16 {
    class Actor {
        public void act() {}
    }
    class HappyActor extends Actor {
        public void act() {
            System.out.println("HappyActor"); }
    }
    class SadActor extends Actor {
        public void act() { System.out.println("SadActor"); }
    }
    class Stage {
        private Actor actor = new HappyActor();
        public void change() { actor = new SadActor(); }
        public void performPlay() { actor.act(); }
    
        
    }

    abstract class AlertStatus {
        abstract void alert();
    }

    class GreenAlert extends AlertStatus {
        void alert() {
            System.out.println("Green Alert");
        }
    }

    class YellowAlert extends AlertStatus {
        void alert() {
            System.out.println("Yellow Alert");
        }
    }

    class RedAlert extends AlertStatus {
        void alert() {
            System.out.println("Red Alert");
        }
    }

    public class Starship {
        public Starship() {}

        AlertStatus alertStatus = new GreenAlert();

        public void toGreenAlert() {
            alertStatus = new GreenAlert();
        }

        public void toYellowAlert() {
            alertStatus = new YellowAlert();
        }

        public void toRedAlert() {
            alertStatus = new RedAlert();
        }

        public void performAlert() {
            alertStatus.alert();
        }
    }
    
}
