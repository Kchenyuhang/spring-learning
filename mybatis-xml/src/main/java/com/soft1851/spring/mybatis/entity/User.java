package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String salt;
    private String email;
    private Integer phoneNumber;
    private Integer status;
    private Integer binding;
    private Integer credits;
    private Timestamp createTime;
    private Timestamp lastLoginTime;
}
