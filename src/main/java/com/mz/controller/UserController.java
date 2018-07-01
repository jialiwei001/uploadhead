package com.mz.controller;

import com.mz.entity.User;
import com.mz.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

import javax.servlet.http.HttpSession;

/**
 * @author mz
 * @Description：
 * @date 2018/7/1
 * @time 9:19
 */
@Controller
public class UserController {
    @Autowired
    UserService userservice;

    @GetMapping("/userInfo")
    public String userInfo(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = new User();
            user.setUid(UUID.randomUUID().toString());
            //设置默认头像
            String avatar = "/0/D/359EC8DE4BE24833A4BAFA98136E0A67.jpeg";
            user.setAvatar(avatar);
            session.setAttribute("user",user);
        }
        return "userInfo";
    }
}
