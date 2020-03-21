package com.soft1851.spring.web.service.impl;

import com.soft1851.spring.web.service.ForumService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ForumServiceImplTest {

    @Autowired
    private ForumService forumService;

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
        System.out.println(forumService.get(8));
    }

    @Test
    public void selectAll() {
        System.out.println(forumService.selectAll());
    }
}