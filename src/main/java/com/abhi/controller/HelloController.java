package com.abhi.controller;

import com.abhi.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Abhi !!!";
    }

    @GetMapping(value = "/employee")
    public Employee firstPage(){
        Employee employee = new Employee();
        employee.setName("Abhi");
        employee.setEmpId("1");
        employee.setDesignation("Architect");
        employee.setSalary(100);
        return employee;
    }

}