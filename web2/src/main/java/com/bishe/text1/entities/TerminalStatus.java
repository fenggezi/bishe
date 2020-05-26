package com.bishe.text1.entities;

import lombok.Data;

@Data
public class TerminalStatus {
    private int lightstatus; //控制电机
    private int hunstatus; // 控制通风

}
