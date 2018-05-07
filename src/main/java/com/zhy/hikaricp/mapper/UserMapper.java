package com.zhy.hikaricp.mapper;

import com.zhy.hikaricp.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author: zhangocean
 * @Date: 2018/5/7 12:34
 * Describe:
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User findUserById(@Param("id") int id);

}
