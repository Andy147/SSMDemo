package org.lanqiao.dao;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by andy on 2017/8/31.
 */
public interface IUserDao {
    /**
     * 获取所有的用户
     * @return 返回一个list集合
     */
    List<User> getAllUser();

    /**
     * 根据条件查找用户
     * @param user 传入一个用户
     * @return 返回一个list集合，封装了查找到的用户
     */
    List<User> findUserByCondition(User user);

    /**
     *根据条件查找用户
     * @param user
     * @return
     */
    int updateUserByCond(User user);

    /**
     * 批量查找
     * @param list
     * @return
     */
    List<User> getUserIn(List<Integer> list);
}
