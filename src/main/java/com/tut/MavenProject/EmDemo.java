package com.tut.MavenProject;

import javax.transaction.Transaction;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo 
{

	public static void main(String[] args) 
	{
	
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student student = new Student();
        student.setId(102);
        student.setCity("Indore");
        student.setName("Warriour");
       
        Certificate certificate = new Certificate();
        certificate.setCourse("JAVA");
        certificate.setDuration("2 monnths");
        
        Session s = factory.openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
       
        student.setCerti(certificate);
        
        s.save(student);
        
        tx.commit();
        s.close();
        
        factory.close();
        
	}
}
