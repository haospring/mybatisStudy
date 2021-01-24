package com.haospring.dao;

import com.haospring.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> queryTeacher();

}
