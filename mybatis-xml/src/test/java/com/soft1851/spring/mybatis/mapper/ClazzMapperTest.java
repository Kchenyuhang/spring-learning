package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Clazz;
import com.soft1851.spring.mybatis.entity.ClazzVo;
import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class ClazzMapperTest {
    @Resource
    private ClazzMapper clazzMapper;

    @Test
    public void getClazzStudent() {
        List<ClazzVo> clazzVo = clazzMapper.getClazzStudent(2);
        clazzVo.forEach(System.out::println);
    }

    @Test
    public void getClazzStudent1() {
        List<Map<String,Object>> clazzVo = clazzMapper.getClazzStudent1(2);
        clazzVo.forEach(System.out::println);
    }

    @Test
    public void getClazzOneToMany() {
        Clazz clazz = clazzMapper.getClazzOneToMany(1);
        List<Student> students = clazz.getStudents();
        students.forEach(student -> System.out.println(student.getStudentName()));
    }

}