package com.mycompany.app.Week1_Exercises;
import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        test(10,1800);
    }

    static void test(int start, int stop){
        int count=0;
        StringBuilder res = new StringBuilder();
        //similar to stringstream in cpp

        for(int i=start; i<=stop; i++){
            for(int j=start; j<=stop; j++){
                if(check(i,j,true)){
                    count++;
                    res.append(count+": "+i+"*"+j+"="+i*j+"\n");
                }
                if(count==4)break;//Need to print 4 nums only. And I'm lazy.
            }
        }
        System.out.println(res);
    }

    static boolean check(int a, int b, boolean no){
        if(no){
            if(a*10<=b || b*10<=a)return false;
        }

        String mul = split(a*b,0);
        String factor = split(a,b);
        return mul.equals(factor);
    }

    static String split(int a, int b){
        StringBuilder res = new StringBuilder();
        ArrayList<Integer> digits = new ArrayList<>();
        while(a>0){
            digits.add(a%10);
            a/=10;
        }
        while(b>0){
            digits.add(b%10);
            b/=10;
        }

        Collections.sort(digits);//Similar to vector in cpp
        for(int i:digits)res.append(i);

        return res.toString();
    }
}
