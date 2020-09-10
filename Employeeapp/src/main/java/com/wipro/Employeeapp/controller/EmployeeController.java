package com.wipro.Employeeapp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.wipro.Employeeapp.bean.Employee;
import com.wipro.Employeeapp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeservice;
	

	@PostMapping("/addEmployee")
	public ModelAndView create(@RequestParam int eid,@RequestParam String ename,ModelAndView mv)
	{
		Employee employee= new Employee(eid,ename);
	    if(employeeservice.addEmployee(employee))
	    {
	    	mv.setViewName("result");
	    	mv.addObject("result","Employee is added");
	    	return mv;
	    }
	    else
	    {
	    	 mv.setViewName("result");
		     mv.addObject("result","Employee not added");
		     return mv;
	     }
	}
 
	@PostMapping("/showEmployee")
	public ModelAndView show(@RequestParam int eid,ModelAndView mv)
	{   
		Employee e=employeeservice.getEmployee(eid);
		mv.setViewName("result");
		if(e==null)
			mv.addObject("result", " Employe not found");
		else
			mv.addObject("result", e);
		return mv;
	}
 
 
	@PostMapping("/showAllEmployees")
	public ModelAndView showAll(ModelAndView mv)
	{   
		ArrayList<Employee> list=employeeservice.getAllEmployee();
		mv.setViewName("result");
		if(list.isEmpty())
			 mv.addObject("result", "no employee found");
		 else
			 mv.addObject("result", list);
		return mv;
 }
	
	
	@PostMapping("/deleteEmployee")
	public ModelAndView delete(@RequestParam int eid,ModelAndView mv)
	{   
		if(employeeservice.deleteEmploye(eid))
		{ 
			mv.setViewName("result");
			mv.addObject("result", "Employee deleted");
			return mv;
		}
		else
		{ 
			mv.setViewName("result");
			mv.addObject("result", "Employee not deleted");
			return mv;
		}
	}
}
