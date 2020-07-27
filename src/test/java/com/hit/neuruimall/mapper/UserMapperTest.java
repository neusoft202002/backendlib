package com.hit.neuruimall.mapper;

import com.hit.neuruimall.model.UserModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void selectByAll() {
        System.out.println(userMapper.selectByAll());
    }

    @Test
    void selectByAllWithAddress() {
        List<UserModel> userModelList = userMapper.selectByAllWithAddress();
        for (UserModel userModel : userModelList) {
            System.out.println(userModel);
        }
    }

    @Test
    void selectAllId() {
        System.out.println(userMapper.selectAllId());
    }

    @Test
    void selectById() {
        System.out.println(userMapper.selectById(1));
    }

    @Test
    void insert() {
        UserModel userModel = new UserModel();
        userModel.setName("three");
        userModel.setAge(22);
        userModel.setBirthday(new Date());
        userModel.setSex("男");
        userMapper.insert(userModel);
        System.out.println(userModel);
    }

    @Test
    void update() {
        UserModel userModel = new UserModel();
        userModel.setId(3);
        userModel.setName("newThree");
        userModel.setAge(25);
        userModel.setBirthday(new Date());
        userModel.setSex("女");
        userMapper.update(userModel);
    }

    @Test
    void deleteById() {
        userMapper.deleteById(4);
    }
}