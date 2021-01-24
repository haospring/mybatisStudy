package com.haospring.test;

import com.haospring.dao.BlogMapper;
import com.haospring.pojo.Blog;
import com.haospring.utils.IDUtils;
import com.haospring.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class BlogTest {
    @Test
    public void testAddBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        System.out.println(mapper.addBlog(new Blog(IDUtils.getId(), "微服务", "haospring", new Date(), 999)));
        sqlSession.close();
    }

    @Test
    public void testQueryAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog=new Blog();
        // blog.setTitle("mybatis");
        // blog.setAuthor("haospring");
        System.out.println(mapper.queryAll(blog));
    }

    @Test
    public void testQueryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog=new Blog();
        blog.setTitle("mybatis");
        // blog.setAuthor("haospring");
        // blog.setViews(888);
        System.out.println(mapper.queryBlogChoose(blog));
    }

    @Test
    public void testUpdateBlogSet(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog=new Blog();
        blog.setId("e361879069fa48e3b760b4ae9918d958");
        blog.setTitle("mysql必知必会");
        // blog.setAuthor("haospring");
        blog.setViews(3306);
        System.out.println(mapper.updateBlogSet(blog));
    }
}
