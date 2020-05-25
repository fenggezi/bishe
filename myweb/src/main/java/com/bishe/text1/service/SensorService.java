package com.bishe.text1.service;


import com.bishe.text1.entities.Sensor;

import java.util.List;

public interface SensorService {
    public List<Sensor> realTimeDate();

    public  List<Sensor>  sensorHistoryDate();

}
