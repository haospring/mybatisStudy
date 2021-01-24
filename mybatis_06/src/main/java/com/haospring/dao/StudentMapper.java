package com.haospring.dao;

import com.haospring.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> queryStudentAndTeacher();
    List<Student> queryStudentAndTeacher2();
}
