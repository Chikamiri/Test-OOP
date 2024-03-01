package com.mycompany.app.Week1_Exercises;
import java.util.*;

public class Ex9{
    static int calc(int n){
        int f1=0, f2=1, fn=1;
        if(n<0){
            return -1;
        } else if(n==0||n==1){
            return n;
        } else{
            for (int i=2; i<n; i++) {
                f1=f2;
                f2=fn;
                fn=f1 +f2;
            }
        }
        return fn;
    }
    public static void fuu9(){
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        
        for (int i=1; i<=n; i++)System.out.println(calc(i));
        temp.close();
    }
}