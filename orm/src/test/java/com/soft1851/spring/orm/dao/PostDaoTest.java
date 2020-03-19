package com.soft1851.spring.orm.dao;

import com.soft1851.spring.orm.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PostDaoTest {
    @Autowired
    private PostDao postDao;

    @Test
    public void insert() throws IOException {
        File img = new File("D:\\资源\\pictures\\good.jpg");
        FileInputStream fis = new FileInputStream(img);
        byte[] tem = new byte[fis.available()];
        fis.read(tem);
        fis.close();
//        URL resource = getClass().getClassLoader().getResource("images/good.jpg");
//        String tem = resource.getPath();
//        byte[] tem = new byte[Integer.parseInt(resource.getPath())];
        Post post = null;
        try {
            post = Post.builder().forumId(4).content("123").thumbnail(tem).createTime(Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()))).title("test0").build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int n = postDao.insert(post);
        assertEquals(1,n);
        System.out.println(n);
    }

    @Test
    public void batchInsert() throws IOException {
        File img = new File("D:\\资源\\pictures\\good.jpg");
        FileInputStream fis = new FileInputStream(img);
        byte[] tem = new byte[fis.available()];
        fis.read(tem);
        fis.close();
        String time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        Post[] posts = {
                Post.builder().forumId(3).content("测试1").thumbnail(tem).createTime(Timestamp.valueOf(time)).title("test1").build(),
                Post.builder().forumId(3).content("测试2").thumbnail(tem).createTime(Timestamp.valueOf(time)).title("test2").build(),
                Post.builder().forumId(3).content("测试3").thumbnail(tem).createTime(Timestamp.valueOf(time)).title("test3").build(),
                Post.builder().forumId(3).content("测试4").thumbnail(tem).createTime(Timestamp.valueOf(time)).title("test4").build(),
        };
        List<Post> postList = Arrays.asList(posts);
        int[] rows = postDao.batchInsert(postList);
        assertEquals(4,rows.length);
    }

    @Test
    public void batchDelete() {
        int[] tem = {16,17,18};
        int[] rows = postDao.batchDelete(tem);
        assertEquals(3,rows.length);
    }

    @Test
    public void delete() {
        int n = postDao.delete(15);
        assertEquals(1,n);
    }

    @Test
    public void selectByWords() {
        List<Post> postList = postDao.selectByWords("测试");
        postList.forEach(System.out::println);
    }

    @Test
    public void countPostByForumId() {
        int n = postDao.countPostByForumId(3);
        System.out.println(n);
    }
}