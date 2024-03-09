package com.mycompany.app.Week2_Exercises.Interfaces;

public class InterfacesEx11 implements Processor {
    public String process(String input){
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }
        return new String(chars);
    }
    /*public static void main(String[] args) {
        InterfacesEx11 e11=new InterfacesEx11();
        System.out.println(e11.process("abc"));
    }*/
}

interface Processor {
    String process(String input);
}

class Apply{
    public static void process(Processor chip, String input){
        System.out.println(chip.process(input));
    }
}
