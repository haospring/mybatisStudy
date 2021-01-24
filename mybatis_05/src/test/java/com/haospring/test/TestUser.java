package com.haospring.test;

import com.haospring.dao.UserMapper;
import com.haospring.pojo.User;
import com.haospring.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

public class TestUser {
    private UserMapper mapper;

    @Before
    public void init() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testQueryAll() {
        System.out.println(mapper.queryAll());
    }

    @Test
    public void testQueryUserById() {
        System.out.println(mapper.queryUserById(2));
    }

    @Test
    public void testAddUser(){
        System.out.println(mapper.addUser(new User(0, "haospring", "haospring")));
    }

    @Test
    public void testUpdateUser(){
        System.out.println(mapper.updateUser(new User(5, "spring", "spring")));
    }

    @Test
    public void testDeleteUser(){
        System.out.println(mapper.deleteUser(5));
    }
}
