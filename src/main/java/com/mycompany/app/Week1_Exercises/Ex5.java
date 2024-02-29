package com.mycompany.app.Week1_Exercises;
//Not done yet!
public class Ex5 {
    //Check Ex10 in previous chapter.
    //Ex10(Bitwise)
     static void testEx10(){ //For learning
        int a = 0xAA;
        int b = 0x55;

        System.out.println("Const a: " +Integer.toBinaryString(a));
        System.out.println("Const b: " +Integer.toBinaryString(b));

        //AND
        System.out.println("Phép AND: a&b= " +Integer.toBinaryString(a&b));
        //OR
        System.out.println("Phép OR: a|b= " +Integer.toBinaryString(a|b));
        //XOR
        System.out.println("Phép XOR: a^b= " +Integer.toBinaryString(a^b));
        //Complement
        System.out.println("Bù đảo của a: ~a= " +Integer.toBinaryString(~a));
        System.out.println("Bù đảo của b: ~b= " +Integer.toBinaryString(~b));
    }


    public static void calc(int a, int b, String op, int isNot){
        int temp=   op.equals("&")?a&b:
                    op.equals("|")?a|b:
                    op.equals("^")?a^b:
                    op.equals("~")?~a:0;
        //Check operator with ternary operator
        if(!op.equals("~"))
            System.out.println(a + op + b +" = "+ temp);
        else
            System.out.println(op+a+" = "+temp);
    }


    public static void main(String[]args){
        int a=0xAA;//10101010 a.k.a 170
        int b=0x55;//1010101 a.k.a 85

        calc(a,b,"&",0);//AND
        calc(a,b,"|",0);//OR
        calc(a,b,"^",1);//XOR
        calc(a,0,"~",0);//~a
        calc(b,0,"~",0);//~b
    }
}
