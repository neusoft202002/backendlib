package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.service.IImgService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ImgServiceImplTest {

    @Autowired
    IImgService imgService;

    @Test
    void getImgUrl() {
        System.out.println(imgService.getImgUrl());
    }

    @Test
    void uploadImg() {
    }
}