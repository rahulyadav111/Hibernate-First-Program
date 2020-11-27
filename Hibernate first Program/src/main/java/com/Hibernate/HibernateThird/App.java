package com.Hibernate.HibernateThird;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Teacher obj=new Teacher();
        obj.setId(1);
        obj.setName("Ramesh_singh");
        obj.setDepartment("computer Science");
        obj.setAddress("Delhi");
        session.save(obj);
        t.commit();
        System.out.println("your table is created....");
        
    }
}
