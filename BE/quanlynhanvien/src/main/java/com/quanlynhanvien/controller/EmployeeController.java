package com.quanlynhanvien.controller;

import com.quanlynhanvien.model.Employee;
import com.quanlynhanvien.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> showEmployee() {
      return   employeeService.showEmployee();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee showEdit(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @PutMapping("/{id}")
    public Employee editEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public Employee deleteEmployee(@PathVariable int id) {
        return employeeService.delete(id);
    }

    @GetMapping("/sortbysalary")
    public List<Employee> sortBySalary() {
        return employeeService.sortBySalary();
    }

}
