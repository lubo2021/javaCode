package com.company;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception{
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
                synchronizedClass.minus2();
            }
        });
        thread1.start();
        thread2.start();
    }
}
