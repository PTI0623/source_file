package org.example;

import java.util.Scanner;

class AgeReadException extends Exception{
    public AgeReadException(){
        super("유효한 나이를 입력하세요");
    }
}
public class Main {
    Main() throws AgeReadException {
        Scanner scan = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = scan.nextInt();

        //try-catch 구문-직접처리
        //throws Age -Main에게 전달
        if(age<0)
            throw new AgeReadException();//강제 예외발생
    }
    public static void main(String[] args)
    {
        try {
            new Main(); //호출한 지점에서 해결해야함
        } catch (AgeReadException e) {
            System.out.println(e);
        }
    }
}