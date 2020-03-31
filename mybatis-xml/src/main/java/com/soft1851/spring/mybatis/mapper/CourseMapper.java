package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Course;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/31
 */
@Transactional(rollbackFor = Exception.class)
public interface CourseMapper {
    /**
     * 根据班课id查询班课详情（班课自身信息，学生列表）
     * @param courseId
     * @return
     */
    Course getCourseById(int courseId);
}
