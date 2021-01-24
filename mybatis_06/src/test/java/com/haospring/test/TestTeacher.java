package com.haospring.test;

import com.haospring.dao.StudentMapper;
import com.haospring.dao.TeacherMapper;
import com.haospring.pojo.Student;
import com.haospring.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestTeacher {
    @Test
    public void testQueryById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.queryById(1));
    }

    @Test
    public void testQueryStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(mapper.queryStudentAndTeacher());
    }

    @Test
    public void testQueryStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println(mapper.queryStudentAndTeacher2());
    }
}
