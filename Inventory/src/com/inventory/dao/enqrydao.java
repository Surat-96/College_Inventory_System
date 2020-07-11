package com.inventory.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.inventory.model.enqrymodel;
import com.inventory.util.HibernateUtil;

public class enqrydao 
{
	public String register(enqrymodel em1) 
	{
		  String msg = "Registration unsuccessful, try again.....";
		  
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  session.save(em1);
		  
		  msg = "Message " + em1.getMsg() + " created successfully, please login...";
		  
		  System.out.println("msg:" + msg);
		  
		  session.getTransaction().commit();
		      
		  //HibernateUtil.shutdown();
		  
		  return msg;   
	}

	public List<enqrymodel> displayalled() 
	{
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql1 = "from enqrymodel";
		  Query query = session.createQuery(hql1);
		  List<enqrymodel> list = query.list();
		  
		  
		  session.getTransaction().commit();
		  
		  return list;
	}
	
	public int delfdbc(int id) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql5 = "delete from enqrymodel where id = :id";
		  Query query5 = session.createQuery(hql5);
		  query5.setParameter("id", id);
		  int rowsAffected = query5.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Deleted " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		return rowsAffected;
		  
	}

}
