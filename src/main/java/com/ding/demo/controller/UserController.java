package com.ding.demo.controller;


import com.ding.demo.mapper.UserMapper;
import com.ding.demo.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author DingShiWei
 * @since 2018-10-10
 */
@RestController
@RequestMapping("/demo/user")
public class UserController {
    @Resource
    private IUserService iUserService;

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/insert")
    public boolean insert(){
        //userMapper.insert()

        return false;
    }
}
