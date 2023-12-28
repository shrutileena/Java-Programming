package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

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
	public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started ..." );
//        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // creating Student obj
        Student student = new Student();
        student.setId(101);
        student.setName("Shruti Agarwal");
        student.setCity("Pune");
        
        // creating Address class
        Address address = new Address();
        address.setAddressId(0);
        address.setStreet("Street1");
        address.setCity("DELHI");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(123.4);
        address.setImage(null);
        
        // reading image
        FileInputStream fileInputStream = new FileInputStream("src/main/java/pic.jpg");
        byte[] data = new byte[fileInputStream.available()];
        fileInputStream.read(data);
        address.setImage(data);
        
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        session.save(student);
        session.save(address);
        System.out.println("Done! ");
//        session.getTransaction().commit();
        
        t.commit();
        
        fileInputStream.close();
        session.close();
        factory.close();
        
    }
}
