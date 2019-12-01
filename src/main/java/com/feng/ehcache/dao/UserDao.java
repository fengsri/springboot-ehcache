package com.feng.ehcache.dao;

import com.feng.ehcache.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/12/1 20:11
 * @Version V1.0
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id=#{id}")
    User getById(@Param("id") Integer id);

}
