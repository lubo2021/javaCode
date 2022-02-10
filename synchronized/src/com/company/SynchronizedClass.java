package com.company;

public class SynchronizedClass {
    public SynchronizedClass(){

    }

    public SynchronizedClass(int t){

    }

    public synchronized void minus(){
        int count=5;
        for(int i=0;i<5;i++){
            count--;
            System.out.println(Thread.currentThread().getName()+"-"+count);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public synchronized void minus2() {
        int count = 5;
        for (int i = 0; i < 5; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
