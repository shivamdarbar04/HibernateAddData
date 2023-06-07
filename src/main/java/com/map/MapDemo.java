package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo 
{
    public static void main(String[] args) 
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
    	 
        Question q1 = new Question();
        q1.setQuestion("What is java ?");
        q1.setQuestionId(1212);
        
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("java is a programming language ");
        q1.setAnswer(answer);
        
        Question q2 = new Question();
        q2.setQuestionId(242);
        q2.setQuestion(" What is collection  in java ?");
        
        Answer answer2 = new Answer();
        answer2.setAnswerId(344);
        answer2.setAnswer("api to work with objects in java ");
        q2.setAnswer(answer2);
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(q1);
        s.save(q2);
        
        tx.commit();
        s.close();
        factory.close();
        
	}
	
	
}
