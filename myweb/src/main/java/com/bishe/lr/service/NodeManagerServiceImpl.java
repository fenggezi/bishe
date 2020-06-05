package com.bishe.lr.service;

import com.bishe.lr.dao.NodeManager;
import com.bishe.lr.entities.NodeS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NodeManagerServiceImpl implements NodeManagerService {
    @Autowired
    NodeManager nodeManager;
    @Override
    public int addguzhang(String address, String node, String type) {
        return nodeManager.guzhangshangbao(address,node,type,new Date());
    }

    @Override
    public List<NodeS> selectNode() {

        return nodeManager.slectNodes();
    }
}
