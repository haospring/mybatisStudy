package com.haospring.dao;

import com.haospring.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    Teacher queryById(@Param("id") Integer id);

}
