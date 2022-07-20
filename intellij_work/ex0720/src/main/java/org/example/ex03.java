package org.example;

class Person implements Cloneable {
    String name;
    int age; //자동 깊은복사 가능

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p1 =(Person) super.clone();
        p1.name = new String(name);
        return p1;
    }
}

public class ex03 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 30);
        System.out.println(p1);
        Person p2 = null;
        try {
            p2 = (Person) p1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(p2);
        System.out.println();
        p1.name = "김길동";
        p1.age = 100;
        System.out.println(p1);
        System.out.println(p2);
    }
}
