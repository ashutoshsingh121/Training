package com;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private SessionFactory factory;
	
	public EmployeeDAOImpl() {
	Configuration c = new Configuration(); 
	c.configure("hibernate.cfg.xml");
	 factory = c.buildSessionFactory();
	}

	@Override
	public int add(Employee employee) {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		Transaction transcation = session.beginTransaction();
		session.save(employee);
		transcation.commit();
		session.clear();
		return 1;
	}

}

