package com.example.demo_ravi_h2.service;

import com.example.demo_ravi_h2.model.Employee;
import com.example.demo_ravi_h2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
@EnableAutoConfiguration
public class EmployeeService {

    @Autowired
    EmployeeRepository erepo;


    public void addEmp(Employee e){
        e.setE_name("abc");
        erepo.save(e);
    }
}
