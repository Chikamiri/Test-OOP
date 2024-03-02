package com.mycompany.app.Week2_Exercises;

public class AccessControl_Ex5 {
    public int a=10;
    @SuppressWarnings("unused")private int b=20;
    protected int c=30;
    int d=40;

    public void A(){
        System.out.println("Inside A()");
    }
    //In App.java
    //AccessControl_Ex5 temp = new AccessControl_Ex5();
    //System.out.println("Public: "+temp.a);
    //temp.A();

    @SuppressWarnings("unused")
    private void B(){
        System.out.println("Inside B()");
    }
    /*The method B()/field AccessControl_Ex5.b
        *from the type AccessControl_Ex5 is not visible*/
    //AccessControl_Ex5 temp = new AccessControl_Ex5();
    //System.out.println("Private: "+temp.b);
    //temp.B();

    protected void C(){
        System.out.println("Inside C()");
    }
    //Same error with temp.b and temp.B()

    void D(){
        System.out.println("Inside D()");
    }
    //AccessControl_Ex5 temp = new AccessControl_Ex5();
    //System.out.println("Private: "+temp.d);
    //temp.D();
    /*Package-access members can only be accessed
        *within the same package(Subfolder Week2_Exercises)*/
}
