package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andy on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {
    @Autowired IUserDao userDao;
    @Test
    public void getUserIn() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1056);
        list.add(1057);
        System.out.println(userDao.getUserIn(list));


    }


    @Test
    public void updateUserByCond() throws Exception {

        User user = new User();

        user.setUserId(1056);
        user.setUserName("张三");
        userDao.updateUserByCond(user);
    }

}