package org.lanqiao.service;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by andy on 2017/8/31.
 */
public interface IUserService {
    /**
     * 获取所有用户
     * @return 返回一个list集合
     */
    List<User> getAllUser();

    /**
     * 根据用户输入的条件查找用户
     * @param user
     * @return
     */
    List<User> findUserByCondition(User user);
}
