package org.example;

class INum {
    int num;

    public INum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.num==((INum)obj).num)
            return true;
        else
        return false;
    }
}

public class ex01 {
    public static void main(String[] args) {
        INum iNum1 = new INum(10);
        INum iNum2 = new INum(10);
        System.out.println(iNum1 == iNum2);
        System.out.println(iNum1);
        System.out.println(iNum2);

        if(iNum1.equals(iNum2)){
            System.out.println("같음");
        }
        else{
            System.out.println("다름");
        }
    }
}
