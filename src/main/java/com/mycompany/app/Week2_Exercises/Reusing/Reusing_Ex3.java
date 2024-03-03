package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex3 {
    @SuppressWarnings("unused")
    public void kn3() {
        Sassafras why=new Sassafras();
    }
}

class Pepsi{
    Pepsi(){
        System.out.print("Put soft drinks from Pepsi ");
    }
}
class Coke extends Pepsi{
    Coke(){
        System.out.print("and Coke into");
    }
}
class Sassafras extends Coke{
    Sassafras(){
        System.out.print(" a bottle of sassafras.");
    }
}