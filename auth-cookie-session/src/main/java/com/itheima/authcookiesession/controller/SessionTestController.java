package com.itheima.authcookiesession.controller;

import com.itheima.authcookiesession.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author brianxia
 * @version 1.0
 * @date 2020/12/21 18:20
 */
@RestController
public class SessionTestController {

    @PostMapping("/login")
    public void login(HttpSession session){
        //前置代码省略
        User user = new User();
        user.setId(1);
        user.setAddress("北京xxx");
        user.setName("张三");
        //设置user对象到session中
        session.setAttribute("user",user);
    }

    @PostMapping("/buy")
    public void sessionTest(HttpSession session){
        User user = (User) session.getAttribute("user");
        System.out.println(user);
    }
}
