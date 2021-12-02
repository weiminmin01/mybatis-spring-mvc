package cn.smbms.controller;


import cn.smbms.beans.User;
import cn.smbms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService ;

    @RequestMapping("addUser")
    public ModelAndView addUser() {
        User user = new User();
        user.setUserCode("halibote");
        user.setUserName("哈利波特");
        user.setUserPassword("123456");
        userService.addUser(user);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addUser");
        return modelAndView ;
    }


    @RequestMapping("deleteUser")
    public  ModelAndView  deleteUser(){
        userService.deleteUser(20);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deteleUser");
        return modelAndView;
    }

    @RequestMapping("updateUser")
    public  ModelAndView  updateUser(){
        User user = new User();
        user.setId(21);
        user.setUserCode("zhangsai");
       user.setUserName("张三");

        userService.updateUser(user);
        ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("updateUser");
      return modelAndView;
    }

    @RequestMapping("getUserList")
    public  ModelAndView getUserList(){
        User user = new User();
        userService.getUserList(user);
        ModelAndView modelAndView = new ModelAndView();
     modelAndView.setViewName("getUserList");
     return modelAndView;
    }

}
