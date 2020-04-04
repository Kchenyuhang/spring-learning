package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/2
 */
@Transactional(rollbackFor = Exception.class)
public interface UserMapper {
    /**
     * 根据手机号和密码进行用户登录
     *
     * @param phoneNumber
     * @param password
     * @return user
     */
    User phoneLogin(@Param("phoneNumber") Integer phoneNumber, @Param("password") String password);

    /**
     * 根据邮箱和密码进行用户登录
     *
     * @param email
     * @param password
     * @return List<User>
     */
    User emailLogin(@Param("email") String email, @Param("password") String password);
}

