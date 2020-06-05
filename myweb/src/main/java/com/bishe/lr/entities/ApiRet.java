package com.bishe.lr.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiRet<T> {

    private int status; // 状态吗
    private List<T> datas; // 数据

}
