package com.bishe.text1.controller;

import com.bishe.text1.entities.Users;
import com.bishe.text1.service.UsersService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.modelmbean.ModelMBeanOperationInfo;
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
            return "login";
        }
        if(!byUsername.getUsername().equals(username)){
            map.put("msg","用户名或密码错误");
            return "login";
        }
        if(!byUsername.getPassword().equals(password)){
            map.put("msg","用户名或密码错误");
            return "login";
        }
        session.setAttribute("loginUser", username);
        return  "redirect:/main.html";
    }

    @PostMapping("/user/login")
    public String login2(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session) {

        session.setAttribute("loginUser", "allens");
        return  "redirect:/main.html";
    }


    @PostMapping("/user/register")
    public String register(@RequestParam("regname") String regname,
                         @RequestParam("regpass") String regpass,
                         Map<String,Object> map){


        System.out.println("allen");


//        Users byUsername = usersService.register(username, password);
//        if(byUsername==null){
//            map.put("msg","用户名或密码错误");
//            return "login";
//        }

        return  "redirect:/login.html";
    }

    //查询 管理员
    public String selectuserALl(Model model){

        return  "";
    }

}
