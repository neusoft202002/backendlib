package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.AdminUserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminUserMapper {

    @Select("select * from adminuser")
    public List<AdminUserModel> selectAllUser();

    @Select("select * from adminuser where username=#{username}")
    public AdminUserModel selectByName(String username);
}
