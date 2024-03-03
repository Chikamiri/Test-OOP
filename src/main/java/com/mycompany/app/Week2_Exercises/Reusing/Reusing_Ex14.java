package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex14 {//Car
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door();
    public Door right = new Door(); // 2-door

	public Reusing_Ex14() {
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}

	public static void main(String[] args) {
		Reusing_Ex14 car = new Reusing_Ex14();
		car.left.window.rollup();
		car.wheel[0].inflate(727);
		car.engine.service();
	}
}

class Engine {
	public void start(){}
	public void rev(){}
	public void stop(){}

	public void service(){
		System.out.println("Time to wreck ur car");
	}
}

class Wheel {
	public void inflate(int psi){}
}

class Window {
	public void rollup(){}
	public void rolldown(){}
}

class Door {
	public Window window = new Window();
	public void open(){}
	public void close(){}
}

