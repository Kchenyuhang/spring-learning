package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Teacher;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/31
 */
public interface TeacherMapper {
    /**
     * 根据teacherId一对一关联查询其管理的班级信息
     * @param teacherId
     * @return
     */
    Teacher getTeacherOneToOne(int teacherId);
}
