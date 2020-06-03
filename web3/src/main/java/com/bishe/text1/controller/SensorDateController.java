package com.bishe.text1.controller;

import com.bishe.text1.entities.ApiRet;
import com.bishe.text1.entities.Sensor;
import com.bishe.text1.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class SensorDateController {

    //两个方法 查询实时数据 和历史数据

    @Autowired
    private SensorService sensorService;

    @GetMapping("/sensor/real")
    public String realJunmp(){
        return "/realdate";
    }
    @GetMapping("/sensor/history")
    public String history(){
        return "/history";
    }
    @GetMapping("/sensor/shezhi")
    public String shezhi(){
        return "/update";
    }
    @GetMapping("/sensor/manager")
    public String manager(){
        return "/manager";
    }






    @GetMapping("/sensorDate/realtime")
    @ResponseBody
    public  Sensor realTime(Model model){//
        ApiRet result = new ApiRet<>();
        List<Sensor> sensorslist = new ArrayList<>();
//        Sensor sensor = sensorService.realTimeDate(); // 每秒ajax 查询的数据值
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Sensor realSensor = new Sensor(1, 22.0, 35.0, 1200, 1256,  1,df.format(new Date()).toString());
        sensorslist.add(realSensor);
        result.setDatas(sensorslist);
        return realSensor;
    }

    @GetMapping("/sensorDate/history")
    @ResponseBody
    public ApiRet<List<Sensor>> historyDate(Model model) {
        //查询历史数据
        ApiRet result = new ApiRet<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Sensor> sensorslist = new ArrayList<>();
        Sensor sensor = new Sensor(1, 22.0, 35.0, 1200, 1256,  1,df.format(new Date()));
        Sensor sensor1 = new Sensor(2, 21.0, 22.1, 1245, 1500, 1,df.format(new Date()));
        Sensor sensor2 = new Sensor(3, 24.0, 15.1, 1256, 1700, 1,df.format(new Date()));
        Sensor sensor3 = new Sensor(4, 20.0, 25.1, 1300, 1300, 1,df.format(new Date()));
        Sensor sensor4 = new Sensor(5, 19.1, 35.1, 1267, 1210, 1,df.format(new Date()));
        Sensor sensor5 = new Sensor(6, 20.2, 25.1, 1267, 1300,1,df.format(new Date()));
        Sensor sensor6 = new Sensor(7, 22.2, 35.1, 1289, 1244, 1,df.format(new Date()));
        Sensor sensor7 = new Sensor(8, 15.0, 15.1, 1293, 1456, 1,df.format(new Date()));
        Sensor sensor8 = new Sensor(9, 35.0, 35.1, 1100, 1633, 1,df.format(new Date()));
        Sensor sensor9 = new Sensor(10, 22.7, 23.1, 980, 1455, 1,df.format(new Date()));
        Sensor sensor10= new Sensor(8, 15.0, 15.1, 1293, 1456, 1,df.format(new Date()));
        Sensor sensor11 = new Sensor(9, 35.0, 35.1, 1100, 1633, 1,df.format(new Date()));
        Sensor sensor12 = new Sensor(10, 22.7, 23.1, 980, 1455, 1,df.format(new Date()));
        sensorslist.add(sensor);
        sensorslist.add(sensor1);
        sensorslist.add(sensor2);
        sensorslist.add(sensor3);
        sensorslist.add(sensor4);
        sensorslist.add(sensor5);
        sensorslist.add(sensor6);
        sensorslist.add(sensor7);
        sensorslist.add(sensor8);
        sensorslist.add(sensor9);
        sensorslist.add(sensor10);
        sensorslist.add(sensor11);
        sensorslist.add(sensor12);
        //数据库查询的值
//        List<Sensor> sensors = sensorService.sensorHistoryDate();
        result.setDatas(sensorslist);
        result.setStatus(2323232);
        return result;
    }

    @GetMapping("/test/history")
    public String sdsds(Model model){
        //跳转历史数据页面
        return "date/history3";
    }

}
