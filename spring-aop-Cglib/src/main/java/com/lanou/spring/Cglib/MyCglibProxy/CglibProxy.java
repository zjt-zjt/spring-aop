package com.lanou.spring.Cglib.MyCglibProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
//Cglib可以代理实现接口的类、也可以代理未实现接口的类
public class CglibProxy  implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        enhancer.setUseCache(false);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       String name= method.getName();
        System.out.println(name+"执行开始了！");
        //代理类对象实例调用父类方法
        Object  retval = methodProxy.invokeSuper(o,objects);
        System.out.println(name+"执行结束了！");
        return  "retval";
    }
}
