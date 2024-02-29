package com.mycompany.app.Tuan2_Code1;

public class Recursion {
    public long factorial(long num){
        if(num<=1)return 1;
        else return num*factorial(num-1);
    }
}
