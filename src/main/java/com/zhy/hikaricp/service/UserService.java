package com.zhy.hikaricp.service;

import com.zhy.hikaricp.model.User;
import org.springframework.stereotype.Service;

/**
 * @author: zhangocean
 * @Date: 2018/5/7 12:36
 * Describe:
 */
@Service
public interface UserService {

    User findUserById(int id);

}
