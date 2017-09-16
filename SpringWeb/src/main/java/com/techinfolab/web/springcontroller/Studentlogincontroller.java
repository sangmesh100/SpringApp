package com.techinfolab.web.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Studentlogincontroller {

	@RequestMapping(value = "Student/login" ,method=RequestMethod.GET)
	public ModelAndView checkStudentLogin(
			@RequestParam("student") String username,
			@RequestParam("password") String password) {

		System.out.println(username);
		System.out.println(password);

		ModelAndView model = new ModelAndView();

		if (username.equalsIgnoreCase("prajna")
				&& password.equalsIgnoreCase("prajna")) {
			model.setViewName("homepage");
		} else {
			model.setViewName("StudentLoginFail");

		}
		return model;
	}
}
