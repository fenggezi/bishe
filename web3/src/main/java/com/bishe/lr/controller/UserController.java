package com.bishe.lr.controller;

import com.bishe.lr.entities.Users;
import com.bishe.lr.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    UsersService usersService;

    @PostMapping("/users/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session){
        Users byUsername = usersService.login(username, password);

        if(byUsername==null){
            map.put("msg","用户名或密码错误");
            return "logins";
        }
        if(!byUsername.getUsername().equals(username)){
            map.put("msg","用户名或密码错误");
            return "logins";
        }
        if(!byUsername.getPassword().equals(password)){
            map.put("msg","用户名或密码错误");
            return "logins";
        }
        session.setAttribute("loginUser", username);
        return  "redirect:/main.html";
    }

    @PostMapping("/user/login")
    public String login2(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session) {

        session.setAttribute("loginUser", "LZ");
        return  "redirect:/main.html";
    }


    @PostMapping("/user/register")
    public String register(@RequestParam("regname") String regname,
                         @RequestParam("regpass") String regpass,
                         Map<String,Object> map){
        int register = usersService.register(regname, regpass);
        if(register>0){
            map.put("msg","注册成功");
            return "login";
        }
        System.out.println("LZ");
        System.out.println(regname);
        System.out.println(regpass);
        return  "redirect:/login.html";
    }

    @GetMapping("/register22")
    public String egisters(){
        return "/register";
    }
}
