package com.employee.employee_mgmt_with_db.dao;

import org.springframework.data.repository.CrudRepository;

import com.employee.employee_mgmt_with_db.models.EmployeeDetails;

public interface EmployeeDetailsDAO extends CrudRepository<EmployeeDetails, Integer> {
    
}
