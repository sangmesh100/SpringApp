package com.techinfolab.web.springdao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.techinfolab.web.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	// inside DAo class we write jdbc and hibernate code for connect database

	@Autowired
	private LocalSessionFactoryBean springSessionFactory;

	public Employee checkEmployeeLogin(Employee emp) {

		SessionFactory hibernateSessionFactory = springSessionFactory.getObject();

		Session session = hibernateSessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		/*emp.setEmployeeID("102");
		emp.setEmployeeName("dillip");
		emp.setEmployeePasswod("dillip");
		emp.setEmployeeSalary(10000);
		emp.setEmployeeEmailid("dillipk10@gmail.com");
		emp.setEmployeeAge(27);
		emp.setDepartmentName("IT");
		emp.setEmployeeAdress("Bangalore");*/
		// to save database we use session.save and input employee object emp
		//session.save(emp);
		Employee empobj = (Employee) session.get(Employee.class, emp.getEmployeeID());
		tx.commit();
		//session.close();

		System.out.println("Data save in database");
		
		return empobj;
	}

}
