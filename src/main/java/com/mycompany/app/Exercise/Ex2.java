package com.mycompany.app.Exercise;

import java.util.Random;

public class Ex2 {
    public static void main(String[]args){
        for(int i=1; i<=25; i++){
            Random rand = new Random();
            int a = rand.nextInt(1000);
            int b = rand.nextInt(1000);

            if(a>b)System.out.println("a>b");
            else if(a<b)System.out.println("a<b");
            else System.out.println("a=b");
        }
    }
}
