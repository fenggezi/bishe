package com.bishe.lr.dao;

import com.bishe.lr.entities.NodeS;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface NodeManager {

    @Insert("")// 对故障插入的SQL 语句
     int guzhangshangbao(@Param("address")String address,@Param("node") String node,@Param("type") String type,@Param("time") Date time);

    @Select("select * from node limit 100") // 节点查看的SQL 语句
    public List<NodeS> slectNodes();

}
