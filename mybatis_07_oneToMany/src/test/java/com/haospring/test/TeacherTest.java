package com.haospring.test;

import com.haospring.dao.TeacherMapper;
import com.haospring.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void testOneToMany(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.queryTeacher());
    }
}
