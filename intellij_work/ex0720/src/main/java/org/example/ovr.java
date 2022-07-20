package org.example;

public class ovr {
    public static void main(String[] args) {
        ovr a1 = new ovr();
        ovr2 a2 = new ovr2();
        System.out.println(a1.san(3,2)+a2.san(3,2));
        //5, 6
    }
    int san(int x,int y){
        return x+y;
    }
}
class ovr2 extends ovr{
    int san(int x,int y){
        return x-y+super.san(x,y);
    }
}
