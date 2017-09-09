package org.lanqiao.controller;

import org.lanqiao.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by andy on 2017/9/2.
 */
@Controller
@RequestMapping("/user")
public class userController {
    @RequestMapping("/register.do")
    public String reg(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/baseType.do")
    @ResponseBody  //该注解指的是将内容或对象作为HTTP相应正文返回 便于测试
    //基本数据类型的绑定
    public String basType(int age){
        return "age:" + age;
    }
    //对于可能出现空的数据，使用包装类型
    @RequestMapping(value = "/baseType2.do")
    @ResponseBody
    public String baseType(Integer age){
        return "age" + age;
    }
    @RequestMapping("/myObj.do")
    @ResponseBody
    //自定义对象类型user
    public String myObj(User user){
        return user.toString();
    }
}
