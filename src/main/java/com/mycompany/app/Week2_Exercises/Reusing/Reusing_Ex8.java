package com.mycompany.app.Week2_Exercises.Reusing;

class A_Ex8{
	A_Ex8(int i){ 
        System.out.println("six"); 
    }
}
class  B_Ex8 extends A_Ex8{
	B_Ex8(){
		super(0);
		System.out.println("temp");
    }
	B_Ex8(int i){
		super(i);
		System.out.println("six("+i+")"); 
    }
}
public class Reusing_Ex8 {
    public static void main(String[] args) {
		new B_Ex8();
		new B_Ex8(6);
	}
}
