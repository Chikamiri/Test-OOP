package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex19 {
    public final String textE19;
    public Reusing_Ex19(){
        textE19="ya can't change this";
    }
    public Reusing_Ex19(String val){
        textE19=val;
    }

    public void kn19() {
        Reusing_Ex19 e19=new Reusing_Ex19();
        //! e19.text="somdosmdos";
        System.out.println(e19.textE19);
    }
}
