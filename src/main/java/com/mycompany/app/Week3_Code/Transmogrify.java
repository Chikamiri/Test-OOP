package com.mycompany.app.Week3_Code;

public class Transmogrify {
    public void testTrans() {//Call these in App.java
        Stage s = new Stage();
        s.go();
        s.change();
        s.go();
    }
}

abstract class Actor {
    abstract void act();
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("Hapi Dancing");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("Sad dancing");
    }
}

class Stage {
    Actor a = new HappyActor();

    void change() {
        a = new SadActor();
    }

    void go() {
        a.act();
    }
}