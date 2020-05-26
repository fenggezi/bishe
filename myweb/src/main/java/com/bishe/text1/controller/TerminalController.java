package com.bishe.text1.controller;

import com.bishe.text1.entities.NodeS;
import com.bishe.text1.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/node")
    public String selectNode(Model model){ // 查看终端节点

        List<NodeS> nodeSList = new ArrayList<>();
        NodeS nodeS = new NodeS(1,0,0);
        NodeS nodeS2 = new NodeS(2,0,0);
        NodeS nodeS3 = new NodeS(3,1,1);
        NodeS nodeS4 = new NodeS(4,1,1);
        nodeSList.add(nodeS);
        nodeSList.add(nodeS2);
        nodeSList.add(nodeS3);
        nodeSList.add(nodeS4);
        model.addAttribute("nodeSList",nodeSList);
        return "date/nodeselect";
    }

}
