package com.bishe.text1.controller;

import com.bishe.text1.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TerminalController {

    @Autowired
    private TerminalService terminalService;

    @GetMapping("/lightcontro")
    public void lightContor(int lightstatus){ //修改光照状态电机的工作情况
        terminalService.updateLight(lightstatus);
    }

    @GetMapping("/windowcontro")
    public void windowcontor(int windowstatus){ // 修改环境的通风状态的通风情况
        terminalService.updateWindow(windowstatus);

    }

}
