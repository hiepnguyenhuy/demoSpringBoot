package com.quanlynhanvien.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;
    private int age;
    private double salary;

    @ManyToOne
    private Branch branch;

}
