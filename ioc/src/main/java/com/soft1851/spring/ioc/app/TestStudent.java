package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.config.AppConfig;
import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
public class TestStudent {
    private static Logger logger = LoggerFactory.getLogger(TestStudent.class);

    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //手动开启扫描
        ctx.scan("com.soft1851.spring.ioc.config");
        //ctx.refresh();
        Student student = (Student) ctx.getBean("student");

        Phone phone = (Phone) ctx.getBean("phone");
        phone.setName("iPhone 9");
        phone.setPrice(8888.8);

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(phone);

        List<String> hobbiesList = new ArrayList<>();
        hobbiesList.add("sword");
        hobbiesList.add("cooking");

        Map subjects = new HashMap();
        subjects.put("语文","88");
        subjects.put("数学","88");

        Set axe = new HashSet();
        axe.add("123");
        axe.add("789");

        student.setId(1);
        student.setName("Archer");
        student.setPhones(phoneList);
        student.setHobbies(hobbiesList);
        student.setSubjects(subjects);
        student.setAxe(axe);
        logger.info(student.toString());
    }
}
