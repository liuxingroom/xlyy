package com.aygxy.xlyy.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.aygxy.xlyy.user.entity.User;

@Repository
public interface UserMapper {

	User findUserById(@Param("id")String id);

}
