package org.example;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("밀리세컨드 랜덤 시작");
        for(int i =0;i<7;i++){
            System.out.println(random.nextInt());
        }
        System.out.println("밀리세컨드 랜덤 끝");

        System.out.println();

        Random randomseed = new Random(42                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            );
        System.out.println("씨드랜덤 시작");
        for(int i=0;i<10;i++){
            System.out.println(randomseed.nextInt(100));
        }
        System.out.println("씨드랜덤 끝");
    }
}
