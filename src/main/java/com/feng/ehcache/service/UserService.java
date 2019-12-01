package com.feng.ehcache.service;

import com.feng.ehcache.dao.UserDao;
import com.feng.ehcache.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/12/1 20:11
 * @Version V1.0
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    private UserDao userDao;


    /**
     * 通过id查询用户,进行缓存
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "user", key = "#id")
    public User getById(Integer id){
        User user = userDao.getById(id);
        return user;
    }

}
