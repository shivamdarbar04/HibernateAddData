package com.tut.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo 
{
public static void main(String[] args)
{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	//get-Student:106
	Student student = (Student)session.load(Student.class, 108);
	System.out.println(student);
}
}
