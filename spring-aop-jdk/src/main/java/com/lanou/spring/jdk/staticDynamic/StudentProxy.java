package com.lanou.spring.jdk.staticDynamic;

import com.lanou.spring.jdk.bean.Person;
import com.lanou.spring.jdk.bean.Student;

public class StudentProxy implements Person {

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void oneDay() {

        System.out.println("我要上课了！");
        student.oneDay();
        System.out.println("马上下课啦！");
    }

    public static void main(String[] args) {
        StudentProxy studentProxy = new StudentProxy();
        studentProxy.setStudent(new Student());
        studentProxy.oneDay();
    }

}
