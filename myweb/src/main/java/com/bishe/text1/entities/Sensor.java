package com.bishe.text1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Sensor {
    // 数据类型实体类
    private int id ;
    private Double temperature;//温度
    private Double humidity;//  湿度 humidity
    private int light; //光照强度 Light intensity
    private int carbon; //二氧 carbon
    private Date senortime;// 时间
    private int num;//终端编号
    private String timesx;

    public Sensor(int id, Double temperature, Double humidity, int light, int carbon, int num, String timesx) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.light = light;
        this.carbon = carbon;
        this.num = num;
//        this.timesx = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(senortime);
        this.timesx = timesx;
    }
}
