package com.mycompany.app.Week2_Exercises.Reusing;

public class Reusing_Ex18 {
    public static final int ex18A=1;//shared among all instances
    public final int ex18B;//Only affects a specify instance
    public Reusing_Ex18(int val){
        this.ex18B=val;
    }

    public void kn18() {
        System.out.println("static final:"+ex18A);
        
        Reusing_Ex18 in1_ex18=new Reusing_Ex18(2);
        Reusing_Ex18 in2_ex18=new Reusing_Ex18(3);

        System.out.println("Instance 1:"+in1_ex18.ex18B);
        System.out.println("Instance 2:"+in2_ex18.ex18B);
    }
}
