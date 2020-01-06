package com.lanou.spring.jdk.bean;

public class Student implements  Person {

    @Override
    public void oneDay() {
        System.out.println("好好学习，天天向上！");
    }
}
