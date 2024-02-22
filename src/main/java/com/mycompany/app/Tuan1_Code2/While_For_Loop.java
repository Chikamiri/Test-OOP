package com.mycompany.app.Tuan1_Code2;

public class While_For_Loop {
    public static void main(String[]args){
        int i=1;
        do{
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
            i++;
        }
        while(i<=5);
    } 
}
