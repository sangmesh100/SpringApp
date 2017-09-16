package com.techinfolab.web.springcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techinfolab.web.pojo.Employee;
import com.techinfolab.web.springservice.EmployeeService;

@Controller
public class EmployeeLogincontroller {
	
	@Autowired
	private EmployeeService empservice;
	
	@Autowired
	private Employee emp;
	
	@RequestMapping(value = "employee/login",method=RequestMethod.POST)
	
	
	
	public ModelAndView  verifyEmployeeLogin(@RequestParam("employeeId") String employeeID,
			@RequestParam("password") String password) 
	{
		System.out.println(employeeID);
		System.out.println(password);
		
		
		ModelAndView model = new ModelAndView();
		
		//if(username.equalsIgnoreCase("dillip") && password.equalsIgnoreCase("dillip")){
	   //model.setViewName("homepage");
	  //}
	 //else{
	//model.setViewName("loginfail");
	  //}
		
		emp.setEmployeeID(employeeID);
		emp.setEmployeePasswod(password);
		
		Employee empobj = empservice.checkEmployeeLogin(emp);	
		
		if(empobj!=null){
			model.addObject("employeedata", empobj);
			model.setViewName("homepage");
		}else{
			model.setViewName("loginfail");
			model.addObject("msg", "Invalid EmpId and Password");
		}
		
		return model;
	}

}