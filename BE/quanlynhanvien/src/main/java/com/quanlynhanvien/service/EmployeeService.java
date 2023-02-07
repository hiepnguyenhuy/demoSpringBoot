package com.quanlynhanvien.service;

import com.quanlynhanvien.model.Employee;
import com.quanlynhanvien.repository.IBranchRepo;
import com.quanlynhanvien.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public List<Employee> showEmployee() {
        return (List<Employee>) iEmployeeRepo.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return iEmployeeRepo.save(employee);
    }

    public Employee findById(int id) {
      return  iEmployeeRepo.findById(id).get();
    }

    public Employee delete(int id) {
        Employee employee = findById(id);
        iEmployeeRepo.deleteById(id);
        return employee;
    }

    public List<Employee> sortBySalary() {

       return (List<Employee>) iEmployeeRepo.findAll(Sort.by("salary"));
    }

}
