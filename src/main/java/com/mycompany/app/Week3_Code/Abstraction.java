package com.mycompany.app.Week3_Code;

public class Abstraction extends Hu_man {
    public static void main(String[] args) {
        God testAbs = new Hu_man();
        testAbs.saySth();
    }
}

abstract class God {
    abstract void saySth();
}

class Hu_man extends God {
    public void saySth() {
        System.out.println("kewh");
    }
}