package com.bishe.lr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DapengController {

    @RequestMapping("/nodeselect")
    public String  dapengManager(){
        return "nodemanager";
    }

}
