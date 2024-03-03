package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex12 extends Root_Ex12 {
    public Reusing_Ex12(){
		System.out.println("R9_E12");
	}

	public void disposeE12(){
		super.disposeE12();
	}

	public static void main(String[] args) {
		Reusing_Ex12 e12=new Reusing_Ex12();
		System.out.println("");
		e12.disposeE12();
	}
}

class Root_Ex12{
	Root_Ex12(){
		System.out.println("I AM (G)ROOT");
	}
	Component1_Ex12 c1e12=new Component1_Ex12();
	Component2_Ex12 c2e12=new Component2_Ex12();
	Component3_Ex12 c3e12=new Component3_Ex12();

	public void disposeE12(){
		c1e12.disposeE12();
		c2e12.disposeE12();
		c3e12.disposeE12();
		System.out.println("Root_Ex12 dispose");
	}
}

class Component1_Ex12{
	Component1_Ex12(){
		System.out.println("AAAAAAAAAA");
	}
	public void disposeE12(){
		System.out.println("Component1_Ex12 dispose");
	}
}
class Component2_Ex12{
	Component2_Ex12(){
		System.out.println("BBBBBBBBBB");
	}
	public void disposeE12(){
		System.out.println("Component2_Ex12 dispose");
	}
}
class Component3_Ex12{
	Component3_Ex12(){
		System.out.println("CCCCCCCCCC");
	}
	public void disposeE12(){
		System.out.println("Component3_Ex12 dispose");
	}
}