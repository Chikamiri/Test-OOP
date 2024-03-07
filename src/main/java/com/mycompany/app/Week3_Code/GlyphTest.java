package com.mycompany.app.Week3_Code;

public class GlyphTest {
    public void testGly() {//App.java
        new RoundGlyph(5);
    }
}

abstract class Glyph {
    void draw(){}

    Glyph() {
        System.out.println("Glyph() before draw");
        draw();
        System.out.println("Glyph() after draw");
    }
}

class RoundGlyph extends Glyph {
    int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph(), radius= " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius=" + radius);
    }
}