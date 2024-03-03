package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex20 {
    public void kn20() {
        Cat car=new Cat();
        car.purr();
    }
}

class Animal{
    public void purr(){
        System.out.println("Insert animal's sound");
    }
}
class Cat extends Animal{
    //@Override
    public void purrs(){//Complier gives error since there is no method purrs()
        System.out.println("Purring when petted");
    }
}