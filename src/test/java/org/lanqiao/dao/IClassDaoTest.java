package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by andy on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IClassDaoTest {


    @Autowired IClassDao classDao;
    @Test
    public void gatAllClassInfo() throws Exception {
        System.out.println(classDao.gatAllClassInfo());

    }
    @Test
    public void getClassById() throws Exception {
        System.out.println(classDao.getClassById(1));
    }




}