package com.bishe.lr.controller;

import com.bishe.lr.dao.DepartmentDao;
import com.bishe.lr.entities.Department;
import com.bishe.lr.entities.Employee;
import com.bishe.lr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    DepartmentDao departmentDao;
    @Autowired
    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @GetMapping("/emps")
    public String list(Model model){
//        List<Employee> employees = employeeService.findAll();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i <i ; i++) {
            Employee employee = new Employee(1, "allen"+i, "allen"+i, 1, 1, new Department());
            employees.add(employee);
        }
        Employee allen = new Employee(1, "allen", "123456789@qq.com", 1, 1, new Department());
        Employee allen2 = new Employee(1, "allen", "123456789@qq.com", 1, 1, new Department());
        Employee allen3 = new Employee(1, "allen", "123456789@qq.com", 1, 1, new Department());
        Employee allen4 = new Employee(1, "allen", "123456789@qq.com", 1, 1, new Department());
        employees.add(allen);
        employees.add(allen2);
        employees.add(allen3);
        employees.add(allen4);
        model.addAttribute("employee", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String tooAddPage(Model model){
//        List<Department> depart = departmentDao.findAll();
//        //List<Employee> employees = employeeServi3ce.findAll();
//        model.addAttribute("departs1",depart);
        return "emp/add";

    }
    @PostMapping("/emp")
    public String insertEmp(Employee employee){
//        employeeService.insertEmp(employee);
//        System.out.println(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String tooUpdatePage(@PathVariable("id") Integer id, Model model){

//        List<Department> depart = departmentDao.findAll();
//        model.addAttribute("departs1",depart);
//
//        Employee emp1 = employeeService.findById(id);
//        model.addAttribute("emp", emp1);
        return "emp/add";
    }

    @PutMapping("/emp")
    public String updateEmp(Employee employee){
//        employeeService.updateEmp(employee);
        return "redirect:/emps";
    }

    @RequestMapping("/empDelete")
    public String deleteEmp(@RequestParam("id") Integer id){
//        employeeService.deleteEmp(id);
        return "redirect:/emps";
    }
}
