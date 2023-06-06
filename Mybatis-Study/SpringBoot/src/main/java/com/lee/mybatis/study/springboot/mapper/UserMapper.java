package com.lee.mybatis.study.springboot.mapper;

import com.lee.mybatis.study.springboot.model.dto.UserDTO;

/**
 * @author liylw
 * @date 2023/6/6 10:39
 */
public interface UserMapper {
    UserDTO queryById(Long id);
}
