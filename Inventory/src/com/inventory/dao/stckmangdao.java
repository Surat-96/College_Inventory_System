package com.inventory.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.inventory.model.applystock;
import com.inventory.model.stockmodel;
import com.inventory.util.HibernateUtil;

public class stckmangdao 
{
	public String add(applystock as) 
	{
		  String msg = "Registration unsuccessful, try again.....";
		  
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  session.save(as);
		  
		  msg = "Staffname " + as.getStaffname() + " created successfully, please login...";
		  
		  System.out.println("msg:" + msg);
		  
		  session.getTransaction().commit();
		      
		  //HibernateUtil.shutdown();
		  
		  return msg;   
   }

	public List<applystock> shwstck(String staffname) 
	{
		boolean f = false;
		
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  	 String hql = "from applystock where staffname = :staffname";
			 Query query = session.createQuery(hql);
			 query.setParameter("staffname", staffname);
			 List<applystock> li = query.list();
			  for(applystock sm : li)
			  {
				  f = true;
			  }
			  session.getTransaction().commit();
			  return li;	
	}
	
	public List<applystock> shwstck1(String department) 
	{
		boolean f = false;
		
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  	 String hql1 = "from applystock where department = :department and status = :status ";
			 Query query1 = session.createQuery(hql1);
			 query1.setParameter("department", department);
			 query1.setParameter("status", "1");
			 List<applystock> li = query1.list();
			  for(applystock sm : li)
			  {
				  f = true;
			  }
			  session.getTransaction().commit();
			  return li;	
	}

	public int hodaproval(int reqid, String status) 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		    
		    String hql2 = "update applystock set status = :status where reqid = :reqid";
		    Query query2 = session.createQuery(hql2);
			query2.setParameter("reqid", reqid);
			query2.setParameter("status", status);
			
			int rowsAffected = query2.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		  return rowsAffected;
	}
	
	public int hodnoaproval(int reqid, String status) 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		    
		    String hql3 = "update applystock set status = :status where reqid = :reqid";
		    Query query3 = session.createQuery(hql3);
			query3.setParameter("reqid", reqid);
			query3.setParameter("status", status);
			
			int rowsAffected = query3.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		  return rowsAffected;
	}
	
	public List<applystock> displyalstckmng() 
	{
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql4 = "from applystock where status = :status";
		  Query query4 = session.createQuery(hql4);
		  query4.setParameter("status", "2");
		  List<applystock> list = query4.list();
		  
		  
		  session.getTransaction().commit();
		  
		  return list;
	}
	
	public List<applystock> promandet(int reqid) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql5 = "from applystock where reqid = :reqid";
		  Query query5 = session.createQuery(hql5);
		  query5.setParameter("reqid", reqid);
		  List<applystock> list = query5.list();
		  
		  session.getTransaction().commit();
		  
		  return list;
	}
	
	public int admnproaproval(int reqid, String status) 
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		    
		    String hql6 = "update applystock set status = :status where reqid = :reqid";
		    Query query6 = session.createQuery(hql6);
			query6.setParameter("reqid", reqid);
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
