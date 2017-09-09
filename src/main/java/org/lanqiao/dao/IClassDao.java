package org.lanqiao.dao;

import org.lanqiao.bean.Classes;

import java.util.List;

/**
 * Created by andy on 2017/9/4.
 */
public interface IClassDao {
    /**
     * 获取班级信息
     * @return
     */
    List<Classes> gatAllClassInfo();

    /**
     * 通过ID查找班级
     * @param id 班级ID
     * @return 返回一个人list集合，包含班级信息
     */

    List<Classes> getClassById(int id);
}
