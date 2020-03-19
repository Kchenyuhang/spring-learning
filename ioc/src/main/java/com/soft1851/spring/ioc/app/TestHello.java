package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
public class TestHello {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) ac.getBean("hello");
        hello.sayHello();
    }
}
