package com.company;

public class Main {

    public static void main(String[] args) {
        final SynchronizedClass synchronizedClass=new SynchronizedClass();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedClass.minus();
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedClass.minus();
            }
        });

        thread1.start();
        thread2.start();
    }
}
