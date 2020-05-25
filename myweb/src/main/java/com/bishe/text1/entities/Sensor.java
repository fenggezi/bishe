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
    private int Light; //光照强度 Light intensity
    private int carbon; //二氧 carbon
    private Date date;// 时间
    private int num;//终端编号
}
