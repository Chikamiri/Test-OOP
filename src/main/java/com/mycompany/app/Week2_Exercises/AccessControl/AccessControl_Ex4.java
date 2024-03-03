package com.mycompany.app.Week2_Exercises.AccessControl;

public class AccessControl_Ex4 {
    protected void vault(){
        System.out.println("This text is in vault()");
    }
    public void cafe(){
        vault();
    }

    /*
    AccessControl_Ex4 temp = new AccessControl_Ex4();
    temp.cafe();
    //Add this in App.java

    //If I do this
    temp.vault();
    I will have this error "The method vault() from the type
                         AccessControl_Ex4 is not visible [Java(67108965)] "
    */
}

