package com.dao;

import org.apache.ibatis.annotations.Select;

import com.entity.User;

public interface UserMapper {
	@Select("select t.chinese, t.english from tb_name t where english = #{name}")
	User selectByE(String name);
}