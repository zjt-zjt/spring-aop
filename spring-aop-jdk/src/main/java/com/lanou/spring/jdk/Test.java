package com.lanou.spring.jdk;



import com.lanou.spring.jdk.bean.Person;
import com.lanou.spring.jdk.bean.Student;
import com.lanou.spring.jdk.myDynamic.dynamicProxy;

import javax.management.DynamicMBean;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Student p = new Student();
        dynamicProxy proxy = new dynamicProxy(p);
        // Student studentProxy  = (Student) Proxy.newProxyInstance(dynamicProxy.class.getClassLoader(),new Class[]{Student.class},proxy);
        //必须得有个接口
        Person   studentProxy = (Person) Proxy.newProxyInstance(dynamicProxy.class.getClassLoader(),new Class[]{Person.class},proxy);
        studentProxy.oneDay();
    }
}
