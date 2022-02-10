package com.company;

public class SynchronizedClass {
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
}
