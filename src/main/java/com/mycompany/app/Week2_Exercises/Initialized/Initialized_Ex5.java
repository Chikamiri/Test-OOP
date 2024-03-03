package com.mycompany.app.Week2_Exercises.Initialized;

public class Initialized_Ex5 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Dog human=new Dog(3);
        Dog cat=new Dog("Mr.Vani");
    }
}

class Dog{
    Dog(int n){
        System.out.println(
            "Thanks for pet me "+n+" times, human!\n"
        );
    }
    Dog(String n){
        System.out.println(
            "Ohmygod is that a cat??\n"
            +"Get out of our house, "+n
        );
    }
    //same with other data types(float, char, etc...)
}