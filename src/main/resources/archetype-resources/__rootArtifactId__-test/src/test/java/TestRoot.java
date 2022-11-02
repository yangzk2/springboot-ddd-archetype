package com.shiqiao.stms.marketingsystem.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestApplication.class)
@DisplayName("Junit5单元测试")
public class TestRoot {

    @Test
    void contextLoads() {}

    @Test
    @DisplayName("测试断言equals")
    void testEquals() {
        Assertions.assertTrue(3 < 4);
    }

}

