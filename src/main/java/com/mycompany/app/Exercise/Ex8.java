package com.mycompany.app.Exercise;

public class Ex8 {
    public static void main(String[]args){
        int i=1;
        switch (i){
            case 1:
                System.out.println("ok");
            case 2:
                System.out.println("no");
            //  If there is no break, once a condition is met,
            //all next case will be evaluted as well. This made
            //multiple messages being printed
            default:{
                System.out.println("Nothing?");
                break;
            }
        }
    }
}
