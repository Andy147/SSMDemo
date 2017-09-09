package org.lanqiao.service.impl;

import org.lanqiao.bean.User;
import org.lanqiao.dao.IUserDao;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by andy on 2017/8/31.
 */
@Service   //告诉spring这是一个server  同时把这个类注册到spring中
public class UserServiceImpll implements IUserService {
    @Autowired
    private IUserDao userDao;
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    public List<User> findUserByCondition(User user) {
        return userDao.findUserByCondition(user);
    }
}
