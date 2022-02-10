package com.company;

import java.util.HashMap;


public class SendData {

    private int convertCount=0;
    private int printCount=0;

    /*接口*/
    public interface CallBack{
        /*定义一个获取信息的方法*/
        public void getPrintResult( int result1);
        public void getConvertResult( int result2);
    }

    public synchronized void getData(CallBack callBack){
        callBack.getConvertResult(convertCount);
        callBack.getPrintResult(printCount);
    }

    public synchronized void setData(int i){
        convertCount=i;
        printCount=i;
        System.out.println("设置参数："+i);
    }
}
