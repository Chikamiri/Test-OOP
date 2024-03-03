package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex10 extends Root_Ex10 {
    public Reusing_Ex10(){
        super(69);
		System.out.println("Re_E10");
	}
	public static void main(String[] args) {
		new Reusing_Ex10();
	}
}

class Root_Ex10{
	Root_Ex10(int i){
		System.out.println("I AM (G)ROOT");
	}
	Component1_Ex10 c1e10=new Component1_Ex10(69);
	Component2_Ex10 c2e10=new Component2_Ex10(69);
	Component3_Ex10 c3e10=new Component3_Ex10(69);
}

class Component1_Ex10{
	Component1_Ex10(int ex10){
		System.out.println("AAAAAAAAAA");
	}
}
class Component2_Ex10{
	Component2_Ex10(int ex10){
		System.out.println("BBBBBBBBBB");
	}
}
class Component3_Ex10{
	Component3_Ex10(int ex10){
		System.out.println("CCCCCCCCCC");
	}
}