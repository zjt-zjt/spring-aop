package com.lanou.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class aspect {
//前置通知

    @Before("com.lanou.spring.aop.pointCut.allAspect()")
    public  void wakeUp(){
        System.out.println("我要起床了！");
    }

  //后置通知
    @After("com.lanou.spring.aop.pointCut.allAspect()")
     public  void sleep(){
        System.out.println("我要睡觉了！");
    }
 //环绕通知  只有抛出异常或注掉@Around才会触发@AfterThrowing通知,如果进行try catch不会触发@AfterThrowing通知。
    @Around("com.lanou.spring.aop.pointCut.allAspect()")
  public Object around(ProceedingJoinPoint joinPoint)  {
      String name =  joinPoint.getSignature().getName();
      System.out.println("我是环绕通知开始");
        Object ret =null;
      try {
        ret=  joinPoint.proceed();
      } catch (Throwable throwable) {
          throwable.printStackTrace();
      }

      System.out.println("我是环绕通知结束");
          return  ret;
  }


  //如果出现异常无法通知，只有正常执行完时才会通知
    @AfterReturning(value = "com.lanou.spring.aop.pointCut.allAspect()",returning = "message")
     public  void afterReturn( Object message){
      System.out.println("[后置返回通知]方法执行已经return了，方法返回值是：" + message);
    }


  //被切入的方法抛出异常以后，会触发此通知
  @AfterThrowing(value = "com.lanou.spring.aop.pointCut.allAspect()",throwing = "ex")
    public void afterThrowing(Throwable ex) {
        System.out.println("[后置异常通知]方法执行出现异常，异常原因：" + ex.getMessage());
    }

}
