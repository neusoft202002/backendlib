package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public List<UserModel> selectByAll();

    public List<Integer> selectAllId();

    public List<UserModel> selectByAllWithAddress();

    public UserModel selectById(Integer id);

    public void insert(UserModel userModel);

    public void update(UserModel userModel);

    public void deleteById(Integer id);

    public List<UserModel> selectDynamic(
            @Param("username") String username, @Param("minAge") Integer minAge, @Param("maxAge") Integer maxAge
            , @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
