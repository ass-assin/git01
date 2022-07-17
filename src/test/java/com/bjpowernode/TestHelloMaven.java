package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testAdd(){
        System.out.println("测试程序执行了！！！");
        HelloMaven helloMaven = new HelloMaven();
       int res= helloMaven.add(10,20);
        Assert.assertEquals(30,res);

    }
    @Test
    public void testAdd2(){
        System.out.println("222测试程序执行了！！！");
        HelloMaven helloMaven = new HelloMaven();
        int res= helloMaven.add(10,20);
        Assert.assertEquals(30,res);

    }
}
