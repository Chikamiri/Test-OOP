package com.mycompany.app.Week2_Exercises.Reusing;

class Game {
	Game(int i) {
		System.out.println("Game contructor");
		}
	}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

public class Reusing_Ex6 extends BoardGame {
	Reusing_Ex6() {
		super(11);
		System.out.println("Chess constructor");
	}
	
	public static void kn6 () {
        new Reusing_Ex6();
	}
}