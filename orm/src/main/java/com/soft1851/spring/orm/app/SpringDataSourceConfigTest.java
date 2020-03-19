package com.soft1851.spring.orm.app;

import com.soft1851.spring.orm.config.SpringDataSourceConfig;
import com.soft1851.spring.orm.dao.ForumDao;
import com.soft1851.spring.orm.entity.Forum;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author yhChen
 * @Description Spring JDBC注解配置——测试类
 * @Date 2020/3/19
 */
public class SpringDataSourceConfigTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDataSourceConfig.class);
        //手动开启扫描
        ctx.scan("com.soft1851.spring.ioc.config");

        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);
        ForumDao forumDao = (ForumDao) ctx.getBean("forumDao");
        Forum forum = Forum.builder().forumName("测试论坛").build();
        int forums = forumDao.insert(forum);
        System.out.println(forum);
    }
}
