package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploRepository extends JpaRepository<Employee,Long> {
    //all crud database method

}
