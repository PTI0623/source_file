package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Config1.class);
        A a1 = acac.getBean(A.class);
        a1.doA();

        acac.close();
    }
}