package com.mycompany.app.Week2_Code;

public class Recursion {
    public long factorial(long num){
        if(num<=1)return 1;
        else return num*factorial(num-1);
    }
}
