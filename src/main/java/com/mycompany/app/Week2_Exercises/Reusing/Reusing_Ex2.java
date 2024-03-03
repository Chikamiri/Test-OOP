package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex2 extends Detergent {
    public void scrub(){
        append("Detergent.scrub()");
        super.scrub();
    }
    public void sterilize(){
        append("Detergent.sterilize()");
    }

    public static void main(String[] args) {
        Cleanser Vim=new Cleanser();
        Vim.apply();
        Vim.dilute();
        Vim.scrub();
        System.out.println(Vim);

        Detergent Javen=new Detergent();
        Javen.foam();
        Javen.scrub();
        System.out.println(Javen);

        Reusing_Ex2 bateria=new Reusing_Ex2();
        bateria.foam();
        bateria.scrub();
        bateria.sterilize();
        bateria.apply();
        bateria.dilute();
        System.out.println(bateria);
    }
}

class Cleanser{
    private String s = " Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	public String toString() {
		return s;
	}
}

class Detergent extends Cleanser {
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub();
	}

	public void foam() {
		append(" foam()");
	}
}