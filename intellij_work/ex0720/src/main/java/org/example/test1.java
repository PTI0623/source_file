package org.example;

import java.awt.*;

class Point implements Cloneable{
    private int xPos;
    private int yPos;

    public Point(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
    public void showPoint(){
        System.out.println("x,y="+xPos+yPos);
    }
    @Override
    public boolean equals(Object obj) {
        if(this.xPos==((Point)obj).xPos && this.yPos ==((Point)obj).yPos){
            return true;
        }
        else
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Rectangle implements Cloneable {
    private Point upperLeft;
    private Point lowerLeft;
    public Rectangle(int x1, int y1, int x2, int y2){
        upperLeft = new Point(x1,y1);
        lowerLeft = new Point(x2,y2);
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public Point getLowerLeft() {
        return lowerLeft;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", lowerLeft=" + lowerLeft +
                '}';
    }

    public void showPoint(){
        System.out.println("좌측상단");
        upperLeft.showPoint();

        System.out.println("우측상단");
        lowerLeft.showPoint();
     }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rectangle copy = (Rectangle) super.clone();
        copy.upperLeft = (Point) upperLeft.clone();
        copy.lowerLeft = (Point) lowerLeft.clone();
        return copy;
    }
}

public class test1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(3,3,4,4);
        Rectangle r2=null;
        Point p1 = new Point(3,3);

        r2=(Rectangle)r1.clone();
        r1.showPoint();
        System.out.println(


        );
        r2.showPoint();


        Point p2=(Point)p1.clone();

        if(p1.equals(p2)){
            System.out.println("좌측 상단 좌표는 같습니다");
        }
        else
            System.out.println("다릅니다");
    }
}
