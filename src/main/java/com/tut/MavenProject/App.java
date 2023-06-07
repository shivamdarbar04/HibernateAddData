package com.tut.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        //creating student
        
        Student st =  new Student();
        st.setId(101);
        st.setName("SHIVAM");
        st.setCity("BANGLORE");
        System.out.println(st);
         
        Session session = factory.openSession();
        
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        
        
        
        session.close();
    }
}
