package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class Main {

    //获取所有公用的构造方法
    public static void test01(){
        try{
            Class c=Class.forName("com.company.TestClass");
            Constructor[] constructors=c.getConstructors();
            for(Constructor constructor:constructors){
                System.out.println(c.getName()+"------"+"公用构造方法："+constructor);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取所有的构造方法
    public static void test02(){
        try{
            Class c=Class.forName("com.company.TestClass");
            Constructor[] declaredConstructors=c.getDeclaredConstructors();
            for(Constructor declaredConstructor:declaredConstructors){
                System.out.println(c.getName()+"------"+"构造方法："+declaredConstructor);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取公有&无参构造方法
    public static void test03(){
        try{
            Class c=Class.forName("com.company.TestClass");
            try{
                Constructor constructor=c.getConstructor(null);
                if(constructor!=null){
                    System.out.println(c.getName()+"------"+"公有&无参构造方法："+constructor);
                }
            }catch (NoSuchMethodException e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //获取公有字段
    public static void test04(){
        try{
            Class c=Class.forName("com.company.TestClass");
            Field[] fields=c.getFields();
            for(Field field:fields){
                System.out.println(c.getName()+"------"+"公有字段："+field);
            }
            //获取指定的公有字段
            Field field=c.getField("kk");
            //获取一个公有的构造方法然后实例化
            Object obj=c.getConstructor().newInstance();
            field.set(obj,"张三");
            TestClass testClass=(TestClass)obj;
            System.out.println(testClass.kk);
            //获取私有字段并实例化
            Field field1=c.getDeclaredField("priString");
            //获取一个公有的构造方法然后实例化
            Object priObj=c.getConstructor().newInstance();
            //暴力反射
            field1.setAccessible(true);
            field1.set(priObj,"private field changed!");
            TestClass testClass1=(TestClass)priObj;
            System.out.println(testClass1.getPriString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        test01();
        test02();
        test03();
        test04();
    }
}
