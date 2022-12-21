package com.itheima.mcdonald.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.mcdonald.entity.User;
import com.itheima.mcdonald.mapper.UserMapper;
import com.itheima.mcdonald.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
