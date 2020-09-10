package com.wipro.Employeeapp.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.Employeeapp.bean.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	

}
