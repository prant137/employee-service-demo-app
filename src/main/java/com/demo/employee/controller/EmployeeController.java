package com.demo.employee.controller;

import com.demo.employee.repository.Employee;
import com.demo.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable @Valid String id) {
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody @Valid Employee employee) {
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    public void updateEmployee(@RequestBody @Valid Employee employee, @PathVariable String id) {
        employeeService.updateEmployee(id, employee);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
    public void deletEmployee(@PathVariable String id) {
        employeeService.deletEmployee(id);
    }
}