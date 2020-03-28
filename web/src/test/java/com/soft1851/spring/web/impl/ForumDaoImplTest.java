package com.soft1851.spring.web.impl;

import com.soft1851.spring.web.ForumDao;
import com.soft1851.spring.web.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ForumDaoImplTest {
    @Autowired
    private ForumDao forumDao;

    @Test
    public void setJdbcTemplate() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void batchInsert() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void get() {
    }

    @Test
    public void selectAll() {
        List<Forum> forums = forumDao.selectAll();
        System.out.println(forums);
    }
}