package com.ding.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DingShiWei
 * @since 2018/10/8 9:53
 * Description: demo
 */

@RestController//@Controller 和 @ResponseBody
public class FirstController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/a")
    public String a(){
        return "1";
    }

    private static Logger logger =
            LoggerFactory.getLogger(FirstController.class.getName());

    @RequestMapping("/logx")
    public boolean logx(){
        logger.trace("我是trace信息");

        logger.debug("我是debug信息1");

        logger.info("我是info信息");
        logger.warn("我是warn信息");
        logger.error("我是error信息");

        return false;
    }
}
