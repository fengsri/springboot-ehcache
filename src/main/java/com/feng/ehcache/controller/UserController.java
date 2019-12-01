package com.feng.ehcache.controller;

import com.feng.ehcache.model.User;
import com.feng.ehcache.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/12/1 20:11
 * @Version V1.0
 */
@RestController
@Slf4j
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User getById(@PathVariable("id")Integer id){
        System.out.println(System.currentTimeMillis());
        User user = userService.getById(id);
        System.out.println(System.currentTimeMillis());
        return user;
    }

}
