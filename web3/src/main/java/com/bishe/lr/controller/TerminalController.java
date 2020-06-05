package com.bishe.lr.controller;

import com.bishe.lr.entities.NodeS;
import com.bishe.lr.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TerminalController {

    @Autowired
    private TerminalService terminalService;
    @GetMapping("/shenwen")//升温 降温
    @ResponseBody
    public Map<String ,Object> shenwen(int status){ //修改光照状态电机的工作情况
//        terminalService.updateLight(status);
        System.out.println("shenwen"+status);
       Map<String ,Object> map = new HashMap<String,Object>();
       map.put("msg","成功");
        return map;
    }

    @GetMapping("/lightcontro") // 光强
    @ResponseBody
    public Map<String ,Object> lightContor(int status) { //修改光照状态电机的工作情况
//        terminalService.updateLight(status);
        System.out.println("shenwen"+status);
        Map<String ,Object> map = new HashMap<String,Object>();
        map.put("msg","成功");
        return map;
    }

    @GetMapping("/windowcontro") // 通风
    @ResponseBody
    public Map<String ,Object> windowcontor(int status){ // 修改环境的通风状态的通风情况
//        terminalService.updateWindow(status);
        System.out.println("shenwen"+status);
        Map<String ,Object> map = new HashMap<String,Object>();
        map.put("msg","成功");
        return map;
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
