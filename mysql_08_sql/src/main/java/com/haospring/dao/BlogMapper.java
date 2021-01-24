package com.haospring.dao;

import com.haospring.pojo.Blog;

import java.util.List;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> queryAll(Blog blog);

    List<Blog> queryBlogChoose(Blog blog);

    int updateBlogSet(Blog blog);
}
