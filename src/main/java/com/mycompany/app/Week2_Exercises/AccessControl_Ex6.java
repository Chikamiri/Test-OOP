package com.mycompany.app.Week2_Exercises;

class First{
    protected int A;
    public First(int data){
        this.A=data;
    }
}
class Second{
    public void manipulate(First obj, int newdata){
        obj.A +=newdata;
        System.out.println(obj.A);
    }
}
public class AccessControl_Ex6{
    public static void main(String[] args) {
        First tempA = new First(10);
        Second tempB = new Second();

        tempB.manipulate(tempA, 20);
 
    }
}