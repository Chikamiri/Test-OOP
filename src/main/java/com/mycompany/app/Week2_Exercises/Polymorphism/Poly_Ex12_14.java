package com.mycompany.app.Week2_Exercises.Polymorphism;

public class Poly_Ex12_14 {
    public class SharedObject {
        private static int referenceCount = 0;
    
        public SharedObject() {
            referenceCount++;
            System.out.println("Shared object is created. Reference count: " + referenceCount);
        }
    
        public void release() {
            referenceCount--;
            System.out.println("Shared object is released. Reference count: " + referenceCount);
            if (referenceCount == 0) {
                System.out.println("No references left.");
            }
        }
    
}
}
