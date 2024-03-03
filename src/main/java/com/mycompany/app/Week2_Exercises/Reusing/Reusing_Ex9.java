package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex9 extends Root_Ex9 {
    public Reusing_Ex9(){
		System.out.println("Re_E9");
	}
	public void kn9() {
		new Reusing_Ex9();
	}
}

class Root_Ex9{
	Root_Ex9(){
		System.out.println("I AM (G)ROOT");
	}
	Component1_Ex9 c1e9=new Component1_Ex9();
	Component2_Ex9 c2e9=new Component2_Ex9();
	Component3_Ex9 c3e9=new Component3_Ex9();

}

class Component1_Ex9{
	Component1_Ex9(){
		System.out.println("AAAAAAAAAA");
	}
}
class Component2_Ex9{
	Component2_Ex9(){
		System.out.println("BBBBBBBBBB");
	}
}
class Component3_Ex9{
	Component3_Ex9(){
		System.out.println("CCCCCCCCCC");
	}
}