package com.hit.neuruimall;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class NeuruimallApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(new Date("2020/07/01").compareTo(new Date("2020/7/2")));
    }
}
