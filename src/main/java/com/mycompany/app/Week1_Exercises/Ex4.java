package com.mycompany.app.Week1_Exercises;
import java.util.*;
import java.lang.Math;



public class Ex4 {

    static boolean Check(int n){
        if(n<2)return false;
        else{
            for(int i=2; i<Math.sqrt(n); i++){
                if(n%i==0)return false;
            }
            return true;
        }
    }

    public static void main(String[]args){
        Scanner PrimeNum = new Scanner(System.in);
        for(int i =1; i<100000; i++){   //Idk, random things.
            int num = PrimeNum.nextInt();

            if(Check(num))System.out.println("YES");
            else System.out.println("NO");
        }

        PrimeNum.close();
    }

  
}

//Remind about boolean.
/*public class Check {
  static boolean Check(int n) {
    if(n<2)return false;
        else{
            for(int i=2; i<Math.sqrt(n); i++){
                if(n%i==0)return false;
            }
            return true;
        }
  }

  public static void main(String[] args) {
  boolean a =  Check(2);
  System.out.println(a);
  }
}*/