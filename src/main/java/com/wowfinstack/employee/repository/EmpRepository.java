package com.wowfinstack.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wowfinstack.employee.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
