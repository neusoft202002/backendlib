package com.hit.neuruimall.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Admin2UserMapper {

    @Select("select USERID from admin2user where ADMINNAME=#{adminName}")
    public Integer selectAdmin2UserId(String adminName);
}
