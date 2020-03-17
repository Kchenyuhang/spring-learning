package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
public class TestStudent {
    private static Logger logger = LoggerFactory.getLogger(TestStudent.class);

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ac.getBean("student");
        logger.info(student.toString());
    }
}
