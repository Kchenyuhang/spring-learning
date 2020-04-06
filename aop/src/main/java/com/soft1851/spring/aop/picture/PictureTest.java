package com.soft1851.spring.aop.picture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/6
 */
public class PictureTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Picture phone = (Picture) ac.getBean("picture");
        phone.text();
        phone.tilt();
    }
}
