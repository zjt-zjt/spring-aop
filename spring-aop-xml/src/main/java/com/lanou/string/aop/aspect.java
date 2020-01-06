package com.lanou.string.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class aspect {
//前置通知
    public  void wakeUp(){
        System.out.println("我要起床了！");
    }

  //后置通知
     public  void sleep(){
        System.out.println("我要睡觉了！");
    }
 //环绕通知
  public  void around(ProceedingJoinPoint joinPoint){
      String name =  joinPoint.getSignature().getName();
      System.out.println(name);
      System.out.println("我是环绕通知开始");
      try {
          joinPoint.proceed();
      } catch (Throwable throwable) {
          throwable.printStackTrace();
      }

      System.out.println("我是环绕通知开始");
  }


  //如果出现异常无法通知，只有正常执行完时才会通知
  public  void afterReturn( Object message){
      System.out.println("[后置返回通知]方法执行已经return了，方法返回值是：" + message);
    }


  //被切入的方法抛出异常以后，会触发此通知

    public void afterThrowing(Throwable ex) {
        System.out.println("[后置异常通知]方法执行出现异常，异常原因：" + ex.getMessage());
    }

}
