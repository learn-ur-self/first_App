package com.crud.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.crudoperation.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
