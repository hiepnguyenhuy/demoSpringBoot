package com.quanlynhanvien.repository;

import com.quanlynhanvien.model.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBranchRepo extends PagingAndSortingRepository<Branch, Integer> {
}
