package com.quanlynhanvien.repository;

import com.quanlynhanvien.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {
}
