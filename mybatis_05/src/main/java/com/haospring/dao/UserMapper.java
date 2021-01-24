package com.haospring.dao;

import com.haospring.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 14727
 * @description 通过注解代替mybatis的配置文件
 */
public interface UserMapper {
    /**
     * 通过注解查询所有用户
     *
     * @return List<User>
     */
    @Select("select * from user")
    List<User> queryAll();

    @Select("select * from user where id=#{id}")
    User queryUserById(Integer id);

    @Insert("insert into user values(null,#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(Integer id);
}
