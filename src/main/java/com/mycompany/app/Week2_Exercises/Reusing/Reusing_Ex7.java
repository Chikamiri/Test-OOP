package com.mycompany.app.Week2_Exercises.Reusing;

class A_Ex7 {
	A_Ex7(int re_ex7){ 
        System.out.println("AAAAAAAAAAAAAAA "+re_ex7); 
    }
}
class B_Ex7 {
	B_Ex7(int re_ex7){ 
        System.out.println("BBBBBBBBBBBBBBB "+re_ex7); 
    }
}
class C_Ex7 extends A_Ex7{
    B_Ex7 bb;
    C_Ex7(int re_ex7A, int re_ex7B){
        super(re_ex7A);
        bb=new B_Ex7(re_ex7B);
    }
}

public class Reusing_Ex7 {
    public static void main(String[] args) {
		new C_Ex7(69,96);
    }
}
