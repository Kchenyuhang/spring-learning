package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;

    @Test
    public void getTeacherOneToOne() {
        Teacher teacher = teacherMapper.getTeacherOneToOne(1);
        System.out.println(teacher.getClazz().getClazzName());
    }
}