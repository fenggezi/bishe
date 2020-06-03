package com.bishe.text1.controller;

import com.bishe.text1.entities.ApiRet;
import com.bishe.text1.entities.NodeS;
import com.bishe.text1.service.TerminalService;
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
        NodeS nodeS = new NodeS(1,0,0,"一号棚节点1");
        NodeS nodeS2 = new NodeS(2,0,0,"一号棚节点2");
        NodeS nodeS3 = new NodeS(3,1,1,"一号棚节点3");
        NodeS nodeS4 = new NodeS(4,1,1,"一号棚节点4");
        NodeS nodeS5 = new NodeS(3,1,1,"二号棚节点3");
        NodeS nodeS6 = new NodeS(4,1,1,"二号棚节点4");
        nodeSList.add(nodeS);
        nodeSList.add(nodeS2);
        nodeSList.add(nodeS3);
        nodeSList.add(nodeS4);
        nodeSList.add(nodeS5);
        nodeSList.add(nodeS6);
        model.addAttribute("nodeSList",nodeSList);
        return "date/nodeselect";
    }

    @GetMapping("/guzhang")
    public String guzhang(Model model){ // 查看终端节点
        List<NodeS> nodeSList = new ArrayList<>();
        NodeS nodeS = new NodeS(1,0,0,"一号棚节点1");
        NodeS nodeS2 = new NodeS(2,0,0,"一号棚节点2");
        NodeS nodeS3 = new NodeS(3,1,1,"一号棚节点3");
        NodeS nodeS4 = new NodeS(4,1,1,"一号棚节点4");
        NodeS nodeS5 = new NodeS(3,1,1,"二号棚节点3");
        NodeS nodeS6 = new NodeS(4,1,1,"二号棚节点4");
        nodeSList.add(nodeS);
        nodeSList.add(nodeS2);
        nodeSList.add(nodeS3);
        nodeSList.add(nodeS4);
        nodeSList.add(nodeS5);
        nodeSList.add(nodeS6);
        model.addAttribute("nodeSList",nodeSList);
        return "date/guzhang";
    }
    @GetMapping("/ziun")
    public String ziun(Model model){ // 查看终端节点
        List<NodeS> nodeSList = new ArrayList<>();
        NodeS nodeS = new NodeS(1,0,0,"一号棚节点1");
        NodeS nodeS2 = new NodeS(2,0,0,"一号棚节点2");
        NodeS nodeS3 = new NodeS(3,1,1,"一号棚节点3");
        NodeS nodeS4 = new NodeS(4,1,1,"一号棚节点4");
        NodeS nodeS5 = new NodeS(3,1,1,"二号棚节点3");
        NodeS nodeS6 = new NodeS(4,1,1,"二号棚节点4");
        nodeSList.add(nodeS);
        nodeSList.add(nodeS2);
        nodeSList.add(nodeS3);
        nodeSList.add(nodeS4);
        nodeSList.add(nodeS5);
        nodeSList.add(nodeS6);
        model.addAttribute("nodeSList",nodeSList);
        return "date/zixun";
    }
    @GetMapping("/hangyenew")
    public String newshangye(Model model){ // 查看终端节点
        List<NodeS> nodeSList = new ArrayList<>();
        NodeS nodeS = new NodeS(1,0,0,"一号棚节点1");
        NodeS nodeS2 = new NodeS(2,0,0,"一号棚节点2");
        NodeS nodeS3 = new NodeS(3,1,1,"一号棚节点3");
        NodeS nodeS4 = new NodeS(4,1,1,"一号棚节点4");
        NodeS nodeS5 = new NodeS(3,1,1,"二号棚节点3");
        NodeS nodeS6 = new NodeS(4,1,1,"二号棚节点4");
        nodeSList.add(nodeS);
        nodeSList.add(nodeS2);
        nodeSList.add(nodeS3);
        nodeSList.add(nodeS4);
        nodeSList.add(nodeS5);
        nodeSList.add(nodeS6);
        model.addAttribute("nodeSList",nodeSList);
        return "date/hangyenew";
    }
}
