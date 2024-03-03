package com.mycompany.app.Week2_Exercises.Reusing;

class A_Ex5{
	A_Ex5(){ 
        System.out.println("AAAAAAAAAAAAAAAAA"); 
    }
}
class B_Ex5 {
	B_Ex5(){ 
        System.out.println("BBBBBBBBBBBBBBB"); 
    }
}
class C_Ex5 extends A_Ex5{
    B_Ex5 bb=new B_Ex5();
}

public class Reusing_Ex5 {
    public static void main(String[] args) {
		new C_Ex5();
    }
}
