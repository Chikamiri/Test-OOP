package com.mycompany.app.Week1_Exercises;

import java.util.*;

public class Ex3 {
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);
        boolean stop = false;

        while(!stop){
            Random rand = new Random();
            int a = rand.nextInt(1000);
            int b = rand.nextInt(1000);

            if(a>b)System.out.println("a>b");
            else if(a<b)System.out.println("a<b");
            else System.out.println("a=b");

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
        Scanner.close();
        System.out.println("Stopped.");
    }
}