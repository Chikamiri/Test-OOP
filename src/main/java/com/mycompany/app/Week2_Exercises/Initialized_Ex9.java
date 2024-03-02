package com.mycompany.app.Week2_Exercises;

public class Initialized_Ex9 {
    public static void main(String[] args) {
        new EA("EEEEE", 3.14);
		new EA(4, true);
    }
}
class EA{
	String a;
	float b;
	int c;
	boolean d;
	EA(String a, double b){
		this.a = a;
		this.b = (float)b;
		System.out.println(this.a + this.b);
	}
	EA(int c, boolean d){
        this("omg",6.9);
		this.c = c; 
		this.d = d;
		System.out.println( this.a + this.b + this.c + this.d);
	}
}