package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.MatterDto;
import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("测试学生")
                .hometown("江苏南京")
                .birthday(LocalDate.of(2000,10,20))
                .build();
        studentMapper.insert(student);
        System.out.println(student.getStudentId());
    }

    @Test
    public void delete() {
        studentMapper.delete(2010);
    }

    @Test
    public void update() {
        Student student = Student.builder()
                .studentId(1009)
                .clazzId(1)
                .studentName("陈宇航")
                .hometown("江苏常州")
                .birthday(LocalDate.of(1999,12,14))
                .build();
        studentMapper.update(student);
        System.out.println(student);
    }

    @Test
    public void getStudentById() {
        System.out.println(studentMapper.getStudentById(1009));
    }

    @Test
    public void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i=0;i<10;i++){
            Student student = Student.builder()
                    .studentId(5000+i)
                    .studentName("测试学生"+i)
                    .clazzId(1)
                    .hometown("测试城市")
                    .birthday(LocalDate.of(1999,12,12))
                    .build();
            students.add(student);
        }
        System.out.println(studentMapper.batchInsert(students));
    }

    @Test
    public void batchDelete() {
        List<Integer> idList = new ArrayList<>();
        for (int i=0;i<10;i++){
            idList.add(4000+i);
        }
        System.out.println(studentMapper.batchDelete(idList));
    }

    @Test
    public void batchUpdate() {
        List<Student> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            Student student = Student.builder()
                    .studentId(5000+i)
                    .studentName("学生" + i)
                    .build();
            list.add(student);
        }
        int n = studentMapper.batchUpdate(list);
        System.out.println(n);
    }

    @Test
    public void selectLimit() {
        System.out.println(studentMapper.selectLimit());
    }

    @Test
    public void selectLimitByDynamicSql() {
        System.out.println(studentMapper.selectLimitByDynamicSql(studentMapper.getStudentById(1009)));
    }

    @Test
    public void selectLimitFormTeacherInClassByDynamicSql() {
        MatterDto matterDto = MatterDto.builder()
                .teacherName("许老师")
                .clazzName("软件1851")
                .studentName("王锋")
                .build();
        studentMapper.selectLimitFromTeacherInClassByDynamicSql(matterDto).forEach(System.out::println);
    }

    @Test
    public void selectAll() {
        List<Student> students = studentMapper.selectAll();
        students.forEach(student -> System.out.println(student.getStudentName()+","+student.getBirthday()));
    }
}