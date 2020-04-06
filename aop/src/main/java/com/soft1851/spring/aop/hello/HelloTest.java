package com.soft1851.spring.aop.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/6
 */
public class HelloTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) ac.getBean("hello");
        System.out.println(hello.sayHello());
    }
}
