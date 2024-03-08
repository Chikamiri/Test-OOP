package com.mycompany.app.Week2_Exercises.Interfaces;

public class InterfacesEx9_10 {
  // Create instruments
  public static void main(String[] args) {
    Instrument flute = new Wind("Flute");
    Instrument drum = new Percussion("Drum");
    Instrument violin = new Stringed("Violin");

    // Play the instruments
    flute.play();
    drum.play();
    violin.play();
  }
}

abstract class Instrument {

  public String name;

  public Instrument(String name) {
    this.name = name;
  }

  public abstract void play();

  @Override
  public String toString() {
    return "Instrument{" + "name='" + name + '\'' + '}';
  }
}

class Wind extends Instrument {

  public Wind(String name) {
    super(name);
  }

  @Override
  public void play() {
    System.out.println(this.name + " makes a blowing sound");
  }
}

class Percussion extends Instrument {

  public Percussion(String name) {
    super(name);
  }

  @Override
  public void play() {
    System.out.println(this.name + " makes a hitting sound");
  }
}

class Stringed extends Instrument {

  public Stringed(String name) {
    super(name);
  }

  @Override
  public void play() {
    System.out.println(this.name + " makes a strumming sound");
  }
}
