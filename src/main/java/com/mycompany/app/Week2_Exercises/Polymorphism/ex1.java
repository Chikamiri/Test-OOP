package com.mycompany.app.Week2_Exercises.Polymorphism;

public class ex1 {
    public static <Cycle> void main(String[] args) throws Throwable {
        Cycle cycle = new Cycle();
        UniCycle uniCycle = new UniCycle();
        Tricycle tricycle = new Tricycle();
        Bicycle bicycle = new Bicycle();
         /*
         * Exercise 2:  (1) Add the @Override annotation to the shapes example.
         */
        Shape[] s = new Shape[9];

        for(int i = 0; i < s.length; i++) {
            s[i] = Shapes.gen.next();
            System.out.println(s[i]);
        }

        for(Shape shp : s) {
            shp.draw();
        }
        /*idk mean of ex3,sr */

        /*Exercise 4: (2) Add a new type of Shape to Shapes.java and verify in main( ) that 
polymorphism works for your new type as it does in the old types. */
        Shape octagon = new Octagon();
        System.out.println(octagon);
        /*ex5
        * Exercise 5:  (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of
         *      wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
         */
}
}
