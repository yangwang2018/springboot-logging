package com.zmx.springboot.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 钟鸣星
 * @date : 2019年12月13日
 */
@SpringBootApplication
@RestController
public class StartUp {

    private Logger log = LoggerFactory.getLogger(StartUp.class);

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }

    @RequestMapping("/getUserInfo")
    public String getUserInfo(String name, String age){
        log.info("name={},age={}", name, age);
        return "name=" + name + "; age=" + age;
    }
}
