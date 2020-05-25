package com.bishe.text1.controller;

import com.bishe.text1.entities.Sensor;
import javafx.scene.input.DataFormat;
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


    @GetMapping("/sensorDate/realtime")
    public String realTime(Model model){
//查询实时数据

        return "emp/list";
    }

    @GetMapping("/sensorDate/historydate")
    @ResponseBody
    public List<Sensor> historyDate(Model model) {
        //查询历史数据
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<Sensor> sensorslist = new ArrayList<>();
        Sensor sensor = new Sensor(1, 22.0, 35.0, 1200, 1256, new Date(), 1);
        Sensor sensor1 = new Sensor(2, 21.0, 22.1, 1245, 1500, new Date(), 1);
        Sensor sensor2 = new Sensor(3, 24.0, 15.1, 1256, 1700, new Date(), 1);
        Sensor sensor3 = new Sensor(4, 20.0, 25.1, 1300, 1300, new Date(), 1);
        Sensor sensor4 = new Sensor(5, 19.1, 35.1, 1267, 1210, new Date(), 1);
        Sensor sensor5 = new Sensor(6, 20.2, 25.1, 1267, 1300, new Date(), 1);
        Sensor sensor6 = new Sensor(7, 22.2, 35.1, 1289, 1244, new Date(), 1);
        Sensor sensor7 = new Sensor(8, 15.0, 15.1, 1293, 1456, new Date(), 1);
        Sensor sensor8 = new Sensor(9, 35.0, 35.1, 1100, 1633, new Date(), 1);
        Sensor sensor9 = new Sensor(10, 22.7, 23.1, 980, 1455, new Date(), 1);
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
        return sensorslist;
    }

    @GetMapping("/test/history")
    public String sdsds(Model model){
//查询实时数据

        return "date/history3";
    }

}
