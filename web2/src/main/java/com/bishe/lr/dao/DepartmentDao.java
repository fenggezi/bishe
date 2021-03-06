package com.bishe.lr.dao;


import com.bishe.lr.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface DepartmentDao {

	@Select("select * from department ")
	List<Department> findAll();

	@Select("select * from department where id=#{id}")
	Department findById(Integer id);
}
