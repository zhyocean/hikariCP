package com.zhy.hikaricp.service.impl;

import com.zhy.hikaricp.mapper.UserMapper;
import com.zhy.hikaricp.model.User;
import com.zhy.hikaricp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zhangocean
 * @Date: 2018/5/7 12:37
 * Describe:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }
}
