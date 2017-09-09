package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.lanqiao.dao.IUserDao;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by andy on 2017/9/1.
 */
@Controller     //告诉spring，这个类就是controller
@RequestMapping("/test")  //请求地址
public class HelloController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/hello.do")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "" , method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAllUser(){
        List<User> userList = userService.getAllUser();
        return userList;
    }
    @RequestMapping("/condition.do")
    @ResponseBody
    public ModelAndView findUserByCondition(User user){
        List<User> userList = userService.findUserByCondition(user);
        ModelAndView mad = new ModelAndView("hello");
        mad.addObject("user" ,userList);
       return mad;
    }
    @RequestMapping("/test.do")
    //重定向
    public String test(){
        return "redirect:/index.jsp";
    }
    //转发
    @RequestMapping("forward.do")
    public String forwardTest01()
    {
        return "forward:/test.jsp";
    }
    @RequestMapping("forward02.do")
    public ModelAndView forwardTest02(){
        Map map = new HashMap();
        map.put("name" , "andy");
        return new ModelAndView("forward:/test.jsp" , map);

    }


}
