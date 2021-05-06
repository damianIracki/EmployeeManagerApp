package com.damianIracki.employeeManager.repositories;

import com.damianIracki.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
