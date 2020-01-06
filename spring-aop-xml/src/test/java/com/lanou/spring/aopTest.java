package com.lanou.spring;

import com.lanou.string.bean.Student;
import com.lanou.string.bean.Teacher;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class aopTest extends  baseTest {
    @Autowired
    private ApplicationContext ctx;
     @Test
    public  void testStudent(){
         Student student= ctx.getBean(Student.class);
         student.oneDay();

    }
    @Test
    public  void testTeacher(){
        Teacher teacher = ctx.getBean(Teacher.class);
        teacher.oneDay();
    }

}
