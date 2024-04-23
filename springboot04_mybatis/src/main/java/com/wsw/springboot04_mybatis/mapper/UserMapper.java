package com.wsw.springboot04_mybatis.mapper;

import com.wsw.springboot04_mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author loriyuhv
 * @ClassName UserMapper
 * @date 2024/4/23 23:09
 * @description TODO
 */

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User findById(Integer id);
}
