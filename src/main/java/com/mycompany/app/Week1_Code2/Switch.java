package com.mycompany.app.Week1_Code2;

public class Switch {
    public void khanh4(){
        int month = 2;
        switch(month){
            case 1:case 3:case 5:case 7:
            case 8:case 10:case 12:{
                System.out.println("31 days");
                break;
            }

            case 4:case 6:case 9:case 11:{
                System.out.println("30 days");
                break;
            }
            default: System.out.println("28/29 days");
        }
    }
}
