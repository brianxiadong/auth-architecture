package com.itheima.authspringsession.controller;

import com.itheima.authspringsession.pojo.User;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author brianxia
 * @version 1.0
 * @date 2020/12/21 18:20
 */
@RestController
public class SessionTestController {

    //使用Get请求方便在浏览器端进行测试
    @GetMapping("/login")
    public void login(HttpSession session){
        //前置代码省略
        User user = new User();
        user.setId(1);
        user.setAddress("北京xxx");
        user.setName("张三");
        //设置user对象到session中
        session.setAttribute("user",user);
    }

    @GetMapping("/buy")
    public void sessionTest(@CookieValue String JSESSIONID, HttpSession session){
        System.out.println("JSessionId=" + JSESSIONID);
        User user = (User) session.getAttribute("user");
        System.out.println(user);
    }

}
