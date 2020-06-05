package com.bishe.lr.dao;

import com.bishe.lr.entities.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeDao {

	@Select("select id,lastName,email,gender,d_id from employee")
	@Results(id="empMap",
			value = {
			@Result(column = "id",property = "id",id=true),
			@Result(column = "lastName",property = "lastName"),
			@Result(column = "email",property = "email"),
			@Result(column = "gender",property = "gender"),
			@Result(column = "d_id",property = "d_id"),
			@Result(column = "d_id",property = "department",one=@One(select = "com.zhangxuan.text1.dao.DepartmentDao.findById"))
			}
	)
	List<Employee> findAll();

	@Select("select * from employee where id=#{id}")
	@ResultMap("empMap")
	Employee findById(Integer id);

	@Insert("insert into employee(lastName,email,gender,d_id)" +
			"values(#{lastName},#{email},#{gender},#{d_id})")
	void insertEmp(Employee employee);


	@Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{d_id} where id=#{id}")
	void updateEmp(Employee employee);

	@Delete("delete from employee where id=#{id}")
	void deleteEmp(Integer id);

}
