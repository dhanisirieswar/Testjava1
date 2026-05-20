package com.javaintroduction;
//Creating the multiple Instance and staic methods acess from anywhere the java  program will follows Filo  and complies line by line
public class TestDemo1 {

    static void display() {

        TestDemo1 testDemo1 = new TestDemo1();
        testDemo1.dance();

        System.out.println("This is display method");
    }

    static void play() {

        System.out.println("This is play method");
    }

    void dance() {

        play();

        System.out.println("This is dancing method");
    }

    void sing() {

        System.out.println("This is sing method");
    }

    public static void main(String args[]) {

        System.out.println("Main method is started");

        TestDemo1.display();

        System.out.println("Main method is ended");
    }
}

