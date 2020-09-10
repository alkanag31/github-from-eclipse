package com.wipro.Employeeapp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Employeeapp.bean.Employee;
import com.wipro.Employeeapp.dao.EmployeeDAO;


@Service
public class EmployeeService {
	 @Autowired
     EmployeeDAO employeedao;
	 
	 public boolean addEmployee(Employee employee) {
		 employeedao.save(employee);
		 return true;
	 }

	
	 public Employee getEmployee(int eid) {
		Employee emp=null;
		if(employeedao.existsById(eid))
		emp=employeedao.getOne(eid);
		return emp;
	 }

	 public ArrayList<Employee> getAllEmployee() {
		ArrayList<Employee> list =(ArrayList<Employee>) employeedao.findAll();
		return list;
	 }

	public boolean deleteEmploye(int eid) {
		Optional<Employee> employee = employeeDAO.findById(eid);
		if(employeedao.existsById(eid))
		{
			//employeedao.deleteById(id);
			employeeDAO.delete(employee.get());
			 return true;
		}
		else
			return false;
	}
	
	

}
