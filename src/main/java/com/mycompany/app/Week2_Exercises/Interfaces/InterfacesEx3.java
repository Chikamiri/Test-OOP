package com.mycompany.app.Week2_Exercises.Interfaces;

public class InterfacesEx3 {
        public static void main(String[] args) {
            Derived derivedObject = new Derived(); 
            derivedObject.print();  
        }
    }
    
    abstract class Base {
    
        public Base() {
            
            print();
        }
    
        
        public abstract void print();
    }
    
    class Derived extends Base {
    
        private int value = 42; 
    
        @Override
        public void print() {
            System.out.println("Value in Derived class: " + value);
        }
    }

