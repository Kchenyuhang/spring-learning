package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.config.AppConfig;
import com.soft1851.spring.ioc.entity.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/19
 */
public class TestPhone {
    private static Logger logger = LoggerFactory.getLogger(TestStudent.class);

    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //手动开启扫描
        ctx.scan("com.soft1851.spring.ioc.config");
        //ctx.refresh();
        Phone phone = (Phone) ctx.getBean("phone");
        phone.setName("iPhone 9");
        phone.setPrice(8888.8);
        System.out.println(phone.toString());
    }
}
