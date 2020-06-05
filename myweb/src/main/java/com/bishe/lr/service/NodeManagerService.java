package com.bishe.lr.service;

import com.bishe.lr.entities.NodeS;

import java.util.List;

public interface NodeManagerService {

    public int addguzhang(String address,String node ,String type);

    public List<NodeS> selectNode();
}
