package com.techinfolab.web.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emptable")
// create table in database emptable
public class Employee {
	@Id
	@Column(name="empid")
	private String employeeID;
	@Column(name="Empname")
	private String employeeName;
	@Column(name="emailId")
	private String employeeEmailid;
	@Column(name="password")
	private String employeePasswod;
	@Column(name="empsalary")
	private int employeeSalary;
	@Column(name="empAge")
	private int employeeAge;
	@Column(name="address")
	private String employeeAdress;
	@Column(name="deptname")
	private String departmentName;
	
	/*create table emptable(
			empid int,
			Empname varchar(50),
			emailId varchar(50), 
			password varchar(50), 
			empsalary int, 
			empAge int, 
			address varchar(50), 
			deptname varchar(50),
			primary key(empid)
			);*/
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmailid() {
		return employeeEmailid;
	}
	public void setEmployeeEmailid(String employeeEmailid) {
		this.employeeEmailid = employeeEmailid;
	}
	public String getEmployeePasswod() {
		return employeePasswod;
	}
	public void setEmployeePasswod(String employeePasswod) {
		this.employeePasswod = employeePasswod;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeAdress() {
		return employeeAdress;
	}
	public void setEmployeeAdress(String employeeAdress) {
		this.employeeAdress = employeeAdress;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
