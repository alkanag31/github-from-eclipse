package com.wipro.Employeeapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Table")
public class Employee {
	
	@Id
	@Column(name = "eid")
	private int eid;
	@Column(name = "ename")
	private String ename;
	
	public Employee() {
	}
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
	
}


