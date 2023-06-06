package com.lee.mybatis.study.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liylw
 * @date 2023/6/6 09:33
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("test")
    public void test(){
        log.info("test");
    }

}
