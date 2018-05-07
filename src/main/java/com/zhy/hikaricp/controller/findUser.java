package com.zhy.hikaricp.controller;

import org.springframework.stereotype.Controller;
import com.zhy.hikaricp.model.User;
import com.zhy.hikaricp.service.UserService;
import net.sf.json.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: zhangocean
 * @Date: 2018/5/7 12:38
 * Describe:
 */
@Controller
public class findUser {

    @Autowired
    UserService userService;

    @GetMapping("/findUser")
    @ResponseBody
    public JSONArray findUser(@Param("id") int id){

        User user = userService.findUserById(id);

        JSONArray jsonObject = JSONArray.fromObject(user);
        return jsonObject;
    }

}
