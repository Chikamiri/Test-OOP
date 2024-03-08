package com.mycompany.app.Week2_Exercises.Interfaces;

public class InterfacesEx5 {
	public void sayOne() {
		System.out.println("one");
	}

	public void sayTwo() {
		System.out.println("two");
	}

	public void sayThree() {
		System.out.println("three");
	}

	public void Number() {
		InterfacesEx5 x = new InterfacesEx5();
		x.sayOne();
		x.sayTwo();
		x.sayThree();
	}
}

class InterfacesEx5_backup {
	public interface Ex5 {
		void sayOne();

		void sayTwo();

		void sayThree();
	}
}
