package com.haospring.mapper;

import com.haospring.pojo.User;

/**
 * @author 14727
 */
public interface UserMapper {
    /**
     * 根据id查询用户
     * @param id 用户id
     * @return User
     */
    User getUserById(Integer id);
}
