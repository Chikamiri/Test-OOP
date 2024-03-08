package com.mycompany.app.Week2_Exercises.Interfaces;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
public static void main(String[] args) {
    String sequence = "abc123";
    CharSequenceIterator iterator = new CharSequenceIterator(sequence);

    Scanner scanner = new Scanner(sequence);  // Or use the iterator with a loop
}
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }

    scanner.close();
}
public class InterfacesEx16 {
    public class CharSequenceIterator implements Iterator<Character> {

    private final String sequence;
    private int index = 0;

    public CharSequenceIterator(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean hasNext() {
        return index < sequence.length();
    }

    @Override
    public Character next() {
        if (hasNext()) {
            return sequence.charAt(index++);
        } else {
            throw new NoSuchElementException();
        }
    }
}


   
}
    
}
