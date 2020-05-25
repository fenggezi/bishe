package com.bishe.text1.controller;

import com.bishe.text1.dao.DepartmentDao;
import com.bishe.text1.entities.Department;
import com.bishe.text1.entities.Employee;
import com.bishe.text1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employee", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String tooAddPage(Model model){
        List<Department> depart = departmentDao.findAll();
        //List<Employee> employees = employeeService.findAll();
        model.addAttribute("departs1",depart);
        return "emp/add";

    }
    @PostMapping("/emp")
    public String insertEmp(Employee employee){
        employeeService.insertEmp(employee);
        System.out.println(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String tooUpdatePage(@PathVariable("id") Integer id, Model model){

        List<Department> depart = departmentDao.findAll();
        model.addAttribute("departs1",depart);

        Employee emp1 = employeeService.findById(id);
        model.addAttribute("emp", emp1);
        return "emp/add";
    }

    @PutMapping("/emp")
    public String updateEmp(Employee employee){
        employeeService.updateEmp(employee);
        return "redirect:/emps";
    }

    @RequestMapping("/empDelete")
    public String deleteEmp(@RequestParam("id") Integer id){
        employeeService.deleteEmp(id);
        return "redirect:/emps";
    }
}
