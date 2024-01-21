package com.veloity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = session.get(Employee.class,2);
		
		employee.setFullName("Aditi");
		employee.setSalary(85742);
		
		session.update(employee);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Record is updated............?");
		
		   
	}
}
