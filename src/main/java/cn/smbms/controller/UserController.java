package cn.smbms.controller;


import cn.smbms.beans.User;
import cn.smbms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService ;

   /* @RequestMapping("addUser")
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
    }*/


    @RequestMapping("index.html")
    public  String login(){
        System.out.println("登录");
        return  "index";
    }


    @RequestMapping("dologin.html")
    public  String  dologin(@RequestParam("userCode") String userCode,@RequestParam("userPassword") String Password ){
        User user=userService.dologin(userCode,Password);
        if(null!=user){
            System.out.println("查询成功");
            return "redirect:/user/main.html";
        }else {
            System.out.println("查询失败");
            return "index";
        }
    }

    @RequestMapping("main.html")
    public  String main(){
        System.out.println("主体功能页面");
        return "frame";
    }

}
