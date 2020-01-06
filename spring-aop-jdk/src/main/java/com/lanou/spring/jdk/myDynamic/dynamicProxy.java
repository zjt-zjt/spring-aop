package com.lanou.spring.jdk.myDynamic;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class dynamicProxy implements InvocationHandler {

  Object target;

    public dynamicProxy(Object target) {
        this.target = target;
    }


    //可以代理任何实现了接口的类，
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
              String name = method.getName();
              System.out.println(name+"开始执行JDK了！");
              Object   ret   =    method.invoke(target,args);
              System.out.println(name+"JDK结束了！");
              return  ret;
    }


}
