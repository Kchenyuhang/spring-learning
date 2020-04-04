package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.User;
import com.soft1851.spring.mybatis.util.Md5;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void phoneLogin() {
        int phoneNumber = 100010;
        String password = Md5.MD5("991214CYH");
        User userList = userMapper.phoneLogin(phoneNumber, password);
        System.out.println(userList);
    }

    @Test
    public void emailLogin() {
        String email = "1797262364@qq.com";
        String password = Md5.MD5("991214CYH");
        User userList = userMapper.emailLogin(email, password);
        System.out.println(userList);
    }
}