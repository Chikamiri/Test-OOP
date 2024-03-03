package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex1 {
    public static void main(String[] args) {
        food something=new food();
        drink somedrink=new drink();
        System.out.println("Eat "+something+ " and drink "+somedrink);
    }
}
class food{
        public String toString(){
            return"MSG";
        }
    }

    class drink{
        public String toString(){
            return"fish sauce";
        }
    }