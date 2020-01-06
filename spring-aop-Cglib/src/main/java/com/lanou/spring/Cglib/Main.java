package com.lanou.spring.Cglib;

import com.lanou.spring.Cglib.MyCglibProxy.CglibProxy;
import com.lanou.spring.Cglib.bean.Student;
import com.lanou.spring.Cglib.bean.Teacher;

public class Main {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
//        Student student = (Student) cglibProxy.getProxy(Student.class);
//        student.oneDay();

          Teacher teacher= (Teacher) cglibProxy.getProxy(Teacher.class);
          teacher.oneDay();
    }
}
