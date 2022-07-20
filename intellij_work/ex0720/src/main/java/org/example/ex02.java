package org.example;

class Point11 implements Cloneable{
    int xPos,yPos;

    public Point11(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ex02 {
    public static void main(String[] args) {
        Point11 org = new Point11(10,20);
        Point11 cpy;
        try {
            cpy = (Point11) org.clone(); //Point 클래스로 형변환
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(org);
        System.out.println(cpy);
        org.xPos=20;
        System.out.println(org);
        System.out.println(cpy);
    }
}
