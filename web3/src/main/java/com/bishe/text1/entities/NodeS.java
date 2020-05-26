package com.bishe.text1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodeS {
    private int id ; //节点编号
    private int status ;//节点状态 0 关闭 1 正常
    private int use;// 是否启用 0 未启用 1 启用
}
