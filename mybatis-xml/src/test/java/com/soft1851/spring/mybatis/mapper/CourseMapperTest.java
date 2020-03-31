package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Course;
import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class CourseMapperTest {
    @Resource
    private CourseMapper mapper;

    @Test
    public void getCourseById() {
        Course course = mapper.getCourseById(20001);
        System.out.println(course.getCourseId()+","+course.getCourseName());
        System.out.println("*******************");
        List<Student> students = course.getStudents();
        students.forEach(student ->
                System.out.println(student.getStudentId()
                        +","+student.getStudentName()
                        +","+student.getHometown()
                        +"," +student.getBirthday()));
//        students.forEach(System.out::println);
    }
}