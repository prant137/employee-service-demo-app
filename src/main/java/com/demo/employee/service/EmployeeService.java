package com.demo.employee.service;

import com.demo.employee.repository.Employee;
import com.demo.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
    return (List<Employee>) employeeRepository.findAll();
    }

    public Employee getEmployee(String id){
        return employeeRepository.findById(id).orElse(null);
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void updateEmployee(String Id, Employee employee){
        employeeRepository.save(employee);
    }

    public void deletEmployee(String id){
        employeeRepository.deleteById(id);
    }
}
