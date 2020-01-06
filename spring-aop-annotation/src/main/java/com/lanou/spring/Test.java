package com.lanou.spring;

import com.lanou.spring.bean.Student;
import com.lanou.spring.bean.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(myConfigrution.class);
        Student student= ctx.getBean(Student.class);
        student.oneDay();

          Teacher teacher = ctx.getBean(Teacher.class);
          teacher.oneDay();
    }
}
