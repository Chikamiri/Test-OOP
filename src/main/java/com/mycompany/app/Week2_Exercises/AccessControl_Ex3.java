package com.mycompany.app.Week2_Exercises;
import static java.lang.System.*;

public class AccessControl_Ex3 {
    public void debug(){
        out.println("Debug()");
    }
    public void debugoff(){
        //nothing :P
    }

    /*
    import static com.mycompany.app.Week2_Exercises.AccessControl_Ex3 as AC_Ex3;

    public static void main(String[] args) {
        AccessControl_Ex3 temp = new AccessControl_Ex3();
        temp.debug();
        temp.debugoff();
    }*/
    //In output: only print "Debug()"
}
