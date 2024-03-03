package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex11 extends DetergentEx11 {
    private DetergentEx11 detergentEx11=new DetergentEx11();
    
    public void scrub(){
        detergentEx11.append(" DetergentEx11.scrub()");
        detergentEx11.scrub();
    }
    public void sterilize(){
        detergentEx11.append(" DetergentEx11.sterilize()");
    }
    public void foam(){
        detergentEx11.append(" DetergentEx11.apply()");
    }
    public void dilute(){
        detergentEx11.append(" DetergentEx11.dilute()");
    }

    public static void main(String[] args) {
        CleanserEx11 Vim=new CleanserEx11();
        Vim.apply();
        Vim.dilute();
        Vim.scrub();
        System.out.println(Vim);

        DetergentEx11 Javen=new DetergentEx11();
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

class CleanserEx11{
    private String s = " CleanserEx11";
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

class DetergentEx11 extends CleanserEx11 {
    private CleanserEx11 cleanserEx11=new CleanserEx11();
	public void scrub() {
		cleanserEx11.append(" DetergentEx11.scrub()");
		cleanserEx11.scrub();
	}

	public void foam() {
		cleanserEx11.append(" foam()");
	}
}