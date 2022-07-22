package org.example;

import java.util.Calendar;

class MySingle{
    public static MySingle ms;
    public MySingle getInstance(){
        if(ms==null){
            ms=new MySingle();
            return ms;
        }else{
            return ms;
        }
    }
    public void doA(){
        System.out.println("doA");
    }
}
public class Ex06 {
    Ex06(){
        MySingle ms1 = new MySingle();
        System.out.println(ms1.getInstance());
        ms1.doA();
        MySingle ms2 = new MySingle();
        System.out.println(ms2.getInstance());
        ms2.doA();

        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
    }

    public static void main(String[] args) {
        new Ex06();
    }
}
