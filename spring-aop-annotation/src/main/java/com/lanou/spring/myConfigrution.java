package com.lanou.spring;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.lanou.spring")
@EnableAspectJAutoProxy
public class myConfigrution {

}
