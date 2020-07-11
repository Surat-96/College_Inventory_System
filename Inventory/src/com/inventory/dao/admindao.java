package com.inventory.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.inventory.model.adminmodel;
import com.inventory.util.HibernateUtil;

public class admindao 
{
	public String register(adminmodel am) 
	{
		  String msg = "Registration unsuccessful, try again.....";
		  
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  session.save(am);
		  
		  msg = "Admin " + am.getAdminname()+ " created successfully, please login...";
		  
		  System.out.println("msg:" + msg);

		  session.getTransaction().commit();
		
		  return msg; 
	}
	
	public List<adminmodel> login(String adminname, String password) 
	{
		boolean flag = false;
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  //System.out.println(adminname +"   "+password);
		  String hql = "from adminmodel where adminname = :adminname and password = :password";
		  Query query = session.createQuery(hql);
		  query.setParameter("adminname", adminname);
		  query.setParameter("password", password);
		  List<adminmodel> li = query.list();
		  for(adminmodel am : li)
		  {
			  flag = true;
			  System.out.println("Admin: " + am.getAdminname());
		  }
		  
		    session.getTransaction().commit();
		    
		    //System.out.println(flag);  
		    return li;
	}
	
	public int update(String adminname, String password)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		  
		 String hql1 = "update adminmodel set password = :password where adminname = :adminname";
		 Query query = session.createQuery(hql1);
		 query.setParameter("adminname",adminname);
		 query.setParameter("password", password);
		  
		  int rowsAffected = query.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		return rowsAffected; 
	}
	
	public void logout() 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  
		  session.getTransaction().commit();
		  
		  session.close();
	}
	

}
