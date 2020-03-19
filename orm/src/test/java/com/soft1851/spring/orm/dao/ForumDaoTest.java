package com.soft1851.spring.orm.dao;

import com.soft1851.spring.orm.config.SpringDataSourceConfig;
import com.soft1851.spring.orm.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/applicationContext.xml"})  //xml配置版
@ContextConfiguration(classes = {SpringDataSourceConfig.class})  //注解配置版
public class ForumDaoTest {
    @Autowired
    private ForumDao forumDao;

    @Test
    public void insert() {
        Forum forum = Forum.builder().forumName("测试论坛11").build();
        int n = forumDao.insert(forum);
        assertEquals(1, n);
        System.out.println(forum);
    }

    @Test
    public void batchInsert() {
        Forum[] forums = {Forum.builder().forumName("测试论坛12").build(),
                Forum.builder().forumName("测试论坛22").build(),
                Forum.builder().forumName("测试论坛32").build()};
        List<Forum> forumList = Arrays.asList(forums);
        int[] rows = forumDao.batchInsert(forumList);
        assertEquals(3, rows.length);
    }

    @Test
    public void delete() {
        int n = forumDao.delete(7);
        assertEquals(1, n);
    }

    @Test
    public void update() {
        Forum forum = forumDao.get(7);
        forum.setForumName("测试论坛修改的新名称");
        int n = forumDao.update(forum);
        assertEquals(1, n);
        System.out.println(forum);
    }

    @Test
    public void get() {
        Forum forum = forumDao.get(7);
        assertNotNull(forum);
        System.out.println(forum);
    }

    @Test
    public void selectAll() {
        List<Forum> forums = forumDao.selectAll();
        assertEquals(4,forums.size());
        System.out.println(forums);
    }
}