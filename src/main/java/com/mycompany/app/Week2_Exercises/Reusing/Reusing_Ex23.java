package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex23 {
    public void kn23() {
            e23.staticMethod();
            new e23();
        }
}
class e23 {
    static {
        System.out.println("Load into class");
    }

    public e23() {
        System.out.println("Create instance");
    }

    public static void staticMethod() {
        System.out.println("Call static method");
    }
}