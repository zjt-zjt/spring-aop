package com.lanou.spring.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class pointCut {

    @Pointcut("execution(* oneDay(..))")
    public void allAspect(){

    }

}
