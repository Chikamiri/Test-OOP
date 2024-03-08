package com.mycompany.app.Week2_Exercises.Interfaces;

public class InterfacesEx6 {
    public static void main(String[] args) {
		InterfacesEx6_backup x = new InterfacesEx6_backup();
		x.sayOne();
		x.sayTwo();
		x.sayThree();
	}
}
interface Ex6 {
	void sayOne();

	void sayTwo();

	void sayThree();
}

class InterfacesEx6_backup implements Ex6 {
	public void sayOne() {
		System.out.println("one");
	}

	public void sayTwo() {
		System.out.println("two");
	}

	public void sayThree() {
		System.out.println("three");
	}
}