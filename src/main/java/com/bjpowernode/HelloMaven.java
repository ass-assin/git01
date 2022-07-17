package com.bjpowernode;

public class HelloMaven {
    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
       int i= helloMaven.add(10,20);
        System.out.println(i);
    }
}
