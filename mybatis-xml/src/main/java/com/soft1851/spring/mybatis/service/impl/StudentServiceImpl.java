package com.soft1851.spring.mybatis.service.impl;

import com.soft1851.spring.mybatis.entity.Student;
import com.soft1851.spring.mybatis.mapper.StudentMapper;
import com.soft1851.spring.mybatis.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/31
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void delete(int studentId) {
        studentMapper.delete(studentId);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }

    @Override
    public int batchInsert(List<Student> students) {
        return 0;
    }

    @Override
    public int batchDelete(List<Integer> idList) {
        return 0;
    }

    @Override
    public List<Student> batchUpdate(List<Student> studentList) {
        return null;
    }
}
