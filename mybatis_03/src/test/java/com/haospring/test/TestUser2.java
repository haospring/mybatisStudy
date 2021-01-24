package com.haospring.test;

import com.haospring.mapper.TestUserMapper;
import com.haospring.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestUser2 {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TestUserMapper mapper = sqlSession.getMapper(TestUserMapper.class);
        System.out.println(mapper.getUserById(1));
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TestUserMapper mapper = sqlSession.getMapper(TestUserMapper.class);
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        System.out.println(mapper.getUserByLimit(map));
        sqlSession.close();
    }
}
