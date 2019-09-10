package com.example.demo_ravi_h2.controller;

import com.example.demo_ravi_h2.model.Employee;
import com.example.demo_ravi_h2.model.Response;
import com.example.demo_ravi_h2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/{id}")
    public Employee getEmployeeDetails(@RequestParam("id") Long id) {
        Employee e = new Employee();
        e.setE_id(id);
        e.setE_name("ravi");
        return e;
    }

    @PostMapping
    public String addEmp(Employee e){
        employeeService.addEmp(e);
        Response res=new Response(200,"success");
        return res.toString();
    }
}

