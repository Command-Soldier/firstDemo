package com.ding.demo.service.impl;

import com.ding.demo.entity.User;
import com.ding.demo.mapper.UserMapper;
import com.ding.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DingShiWei
 * @since 2018-10-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
