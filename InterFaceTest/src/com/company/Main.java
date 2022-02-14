package com.company;

public class Main {

    public static void main(String[] args) {
        final SendData sendData=new SendData();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    try{
                        Thread.sleep(200);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    sendData.getData(new SendData.CallBack() {
                        @Override
                        public void getPrintResult(int result1) {
                            System.out.println(result1);
                        }
                        @Override
                        public void getConvertResult(int result2) {
                            System.out.println(result2);
                        }
                    });

                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    try{
                        Thread.sleep(200);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    sendData.setData(i);
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
