package com.techinfolab.web.springservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.techinfolab.web.pojo.Employee;
import com.techinfolab.web.springdao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDAO empdao;
	
	public Employee checkEmployeeLogin(Employee emp) {
		// TODO Auto-generated method stub
		
		Employee empobj = empdao.checkEmployeeLogin(emp);
		
		return empobj;
	}

	
	
}
