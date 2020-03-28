package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.config.SpringDataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class TopicDaoTest {
    @Autowired
    private TopicDao topicDao;
    @Test
    public void selectAll() {
        System.out.println(topicDao.selectAll());
    }
}