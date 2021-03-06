package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Book;
import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/17
 */
@Configuration
public class AppConfig {
    @Bean
    public Phone phone() {
        Phone phone = new Phone();
        phone.setName("iPhone 9");
        phone.setPrice(8888.8);
        return phone;
    }

    @Bean
    public Student student() {
        return new Student();
    }

    @Bean
    public Book book() {
        return new Book();
    }
}
