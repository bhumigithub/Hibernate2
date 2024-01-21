package com.veloity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Insert the data
		Employee emp1 = new Employee();
		emp1.setFullName("abcd");
		emp1.setCity("xyz");
		emp1.setAge(34);
		emp1.setSalary(354342);
		
		Employee emp2 = new Employee();
		emp2.setFullName("xvxc");
		emp2.setCity("dvsd");
		emp2.setAge(3);
		emp2.setSalary(435);
		
		Employee emp3 = new Employee();
		emp3.setFullName("wefsf");
		emp3.setCity("wssz");
		emp3.setAge(32);
		emp3.setSalary(3523);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("all records added.....!!");
	}

}
