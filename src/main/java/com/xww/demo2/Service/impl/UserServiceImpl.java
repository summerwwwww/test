package com.xww.demo2.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xww.demo2.Service.UsersService;
import com.xww.demo2.entity.Users;
import com.xww.demo2.mapper.UsersMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {
}
