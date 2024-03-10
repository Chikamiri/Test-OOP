package com.mycompany.app.Week3_Exercises;

public class AbastractClass {// Orchestra

  public static void main(String[] args) {
    Instrument[] instruments = { new Wind(), new Percussion(), new Stringed(), new Woodwind(), new Brass() };

    for (Instrument instrument : instruments) {
      instrument.play();
      System.out.println(instrument.what());
    }
  }
}

abstract class Instrument {
  // Abstract method to play the instrument
  abstract void play();

  // Method to identify the instrument
  String what() {
    // Provide an implementation to return the instrument type
    return "Instrument";
  }

  // Abstract method to adjust the instrument
  abstract void adjust();
}

class Wind extends Instrument {
  @Override
  void play() {
    System.out.println("Playing a wind instrument");
  }

  // Implement what() to return specific wind instrument type
  @Override
  String what() {
    return "Wind Instrument";
  }

  @Override
  void adjust() {
    System.out.println("Adjusting a wind instrument");
  }
}

class Percussion extends Instrument {
  @Override
  void play() {
    System.out.println("Playing a percussion instrument");
  }

  // Implement what() to return specific percussion instrument type
  @Override
  String what() {
    return "Percussion Instrument";
  }

  @Override
  void adjust() {
    System.out.println("Adjusting a percussion instrument");
  }
}

class Stringed extends Instrument {
  @Override
  void play() {
    System.out.println("Playing a stringed instrument");
  }

  // Implement what() to return specific stringed instrument type
  @Override
  String what() {
    return "Stringed Instrument";
  }

  @Override
  void adjust() {
    System.out.println("Adjusting a stringed instrument");
  }
}

class Woodwind extends Wind {
  @Override
  void play() {
    System.out.println("Playing a woodwind instrument");
  }

  // Implement what() to return specific woodwind instrument type (optional)
  @Override
  String what() {
    return "Woodwind Instrument";
  }
}

class Brass extends Wind {
  @Override
  void play() {
    System.out.println("Playing a brass instrument");
  }

  // Implement what() to return specific brass instrument type (optional)
  @Override
  String what() {
    return "Brass Instrument";
  }
}