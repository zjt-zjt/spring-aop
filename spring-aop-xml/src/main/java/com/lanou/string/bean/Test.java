package com.lanou.string.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student= ctx.getBean(Student.class);
        student.oneDay();

        Teacher teacher = ctx.getBean(Teacher.class);
        teacher.oneDay();
    }


}
