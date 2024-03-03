package com.mycompany.app.Week2_Exercises.Initialized;

class TotallyNot_aBadCompany{
    public void EA(){
        System.out.println("Hasagi Creeps");
        Konami();
        this.Konami();
    }
    public void Konami(){
        System.out.println("omg monke");
    }
}
public class Initialized_Ex8{
    public void yuu8() {
        TotallyNot_aBadCompany sus=new TotallyNot_aBadCompany();
        sus.EA();
        sus.Konami();
    }
}

/*
class Leaf {
    int i=0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i="+i);
    }
    public static void main(String[] args) {
        Leaf x=new Leaf();
        x.increment().increment().increment().print();
    }
}*/