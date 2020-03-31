package com.soft1851.spring.mybatis.service;

import com.soft1851.spring.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/31
 */
public interface StudentService {
    /**
     * 新增student，并返回自增主键
     * @param student
     */
    void insert(Student student);

    /**
     * 根据studentId删除Student
     * @param studentId
     */
    void delete(int studentId);

    /**
     * 更新student
     * @param student Student
     */
    void update(Student student);

    /**
     * 根据studentId查询Student
     * @param studentId int
     * @return Student
     */
    Student getStudentById(int studentId);

    /**
     * 批量插入
     * @param students List<Student>
     * @return int
     */
    int batchInsert(@Param("students") List<Student> students);

    /**
     * 批量删除
     * @param idList List<Integer>
     * @return int
     */
    int batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 批量修改
     * @param studentList List<Student>
     * @return List<Student>
     */
    List<Student> batchUpdate(@Param("studentList") List<Student> studentList);
}
