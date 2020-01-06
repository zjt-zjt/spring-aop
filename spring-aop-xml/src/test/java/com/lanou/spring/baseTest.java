package com.lanou.spring;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class baseTest {
}
