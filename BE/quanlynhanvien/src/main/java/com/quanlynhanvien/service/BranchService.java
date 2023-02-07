package com.quanlynhanvien.service;

import com.quanlynhanvien.model.Branch;
import com.quanlynhanvien.repository.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {
    @Autowired
    IBranchRepo iBranchRepo;
    public List<Branch> showBranch() {
        return (List<Branch>) iBranchRepo.findAll();
    }
}
