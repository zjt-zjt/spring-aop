package com.lanou.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

    public  String oneDay(){
        System.out.println("认真写作业！");
        String name = null;
//       System.out.println(name.length());
//        System.out.println("讲课！");
          return "老师的一天";
    }
}
