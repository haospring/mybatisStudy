package com.haospring.mapper;

import com.haospring.pojo.TestUser;
import com.haospring.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author 14727
 */
public interface TestUserMapper {
    /**
     * 根据id查询用户
     * @param id
     * @return User
     */
    TestUser getUserById(Integer id);

    List<TestUser> getUserByLimit(Map<String,Integer> map);
}
