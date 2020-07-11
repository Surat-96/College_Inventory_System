package com.inventory.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.inventory.util.HibernateUtil;
import com.inventory.model.applystock;
import com.inventory.model.servicemodel;

public class servicedao 
{
	public String seradd(servicemodel sermod) 
	{
		  String msg = "Adding unsuccessful, try again.....";
		  
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  session.save(sermod);
		  
		  msg = "Service Type " + sermod.getType()+ " adding successfully";
		  
		  System.out.println("msg:" + msg);

		  session.getTransaction().commit();
		
		  return msg; 
	}
	
	public List<servicemodel> shwser(String name) 
	{
		boolean f = false;
		
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  	 String hql = "from servicemodel where name = :name";
			 Query query = session.createQuery(hql);
			 query.setParameter("name", name);
			 List<servicemodel> li = query.list();
			  for(servicemodel sm : li)
			  {
				  f = true;
			  }
			  session.getTransaction().commit();
			  return li;	
	}
	
	public List<servicemodel> shwstck1(String department) 
	{
		boolean f = false;
		
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  	 String hql1 = "from servicemodel where department = :department and status = :status ";
			 Query query1 = session.createQuery(hql1);
			 query1.setParameter("department", department);
			 query1.setParameter("status", "1");
			 List<servicemodel> li = query1.list();
			  for(servicemodel sm : li)
			  {
				  f = true;
			  }
			  session.getTransaction().commit();
			  return li;	
	}
	
	public int hodaproval(int serid, String status) 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		    
		    String hql2 = "update servicemodel set status = :status where serid = :serid";
		    Query query2 = session.createQuery(hql2);
			query2.setParameter("serid", serid);
			query2.setParameter("status", status);
			
			int rowsAffected = query2.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		  return rowsAffected;
	}
	
	public int hodnoaproval(int serid, String status) 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		    
		    String hql3 = "update servicemodel set status = :status where serid = :serid";
		    Query query3 = session.createQuery(hql3);
			query3.setParameter("serid", serid);
			query3.setParameter("status", status);
			
			int rowsAffected = query3.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		  return rowsAffected;
	}
	
	public List<servicemodel> displyalsermng() 
	{
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql4 = "from servicemodel where status = :status";
		  Query query4 = session.createQuery(hql4);
		  query4.setParameter("status", "2");
		  List<servicemodel> list = query4.list();
		  
		  
		  session.getTransaction().commit();
		  
		  return list;
	}
	
	public List<servicemodel> sermandet(int serid) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql5 = "from servicemodel where serid = :serid";
		  Query query5 = session.createQuery(hql5);
		  query5.setParameter("serid", serid);
		  List<servicemodel> list = query5.list();
		  
		  session.getTransaction().commit();
		  
		  return list;
	}
	
	public int admnseraproval(int serid, String status) 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		    
		    String hql6 = "update servicemodel set status = :status where serid = :serid";
		    Query query6 = session.createQuery(hql6);
			query6.setParameter("serid", serid);
			query6.setParameter("status", status);
			
			int rowsAffected = query6.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		  return rowsAffected;
	}

	
	

}
