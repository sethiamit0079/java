package com.example.demo;

import java.lang.module.Configuration;

import org.hibernate.Session;

public class App {
	public static void main(String[] args) {

		//learn code durga
//		Configuration  cf = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory fac = cfg.buildSessionFactory();
		
		//creating Student
		student st = new student();
		st.setCiy("delhi");
		st.setId(101);
		st.setName("pooja");
		
		System.out.println(st);
		
		//Session session = factory.getCurrentSession();
		//session.beginTransaction();
		//session.save(st);
		//session.getTransaction().commit();
		//session.close();
	}

}
