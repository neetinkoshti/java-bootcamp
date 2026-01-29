package com.ntn.march2025.multithreading;

public class PlayingWithThread {

    public static void main(String[] args) {

        A obj = new A();

        obj.start();
//        obj.run();
    }

}

class A extends Thread{

    public void start(){
        System.out.println("Start method of class A");
    }

    @Override
    public void run() {
        System.out.println("Run method of run");
    }
}
