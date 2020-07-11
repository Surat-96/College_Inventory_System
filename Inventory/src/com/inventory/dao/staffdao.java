package com.inventory.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.inventory.util.HibernateUtil;
import com.inventory.model.staffmodel;

public class staffdao 
{
	public String register(staffmodel sm) 
	{
		  String msg = "Registration unsuccessful, try again.....";
		  
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  session.save(sm);
		  
		  msg = "Staffname " + sm.getStaffname() + " created successfully, please login...";
		  
		  System.out.println("msg:" + msg);
		  
		  session.getTransaction().commit();
		      
		  //HibernateUtil.shutdown();
		  
		  return msg;   
   }
	
	public static boolean  staffnamecheck(String emailid)
	{
		boolean f = false;
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		 String hql = "from staffmodel where emaild = :emailid";
		 Query query = session.createQuery(hql);
		 query.setParameter("emailid", emailid);
		 List<staffmodel> li = query.list();
		  for(staffmodel sm : li)
		  {
			  f = true;
		  }
		  session.getTransaction().commit();
		  return f;
	}
	
	public List<staffmodel> stafflogin(String emailid, String password, String designation) 
	{
		boolean flag = false;
		
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  
		  String hql1 = "from staffmodel where emailid = :emailid and password = :password and designation = :designation and status = :status ";
		  Query query1 = session.createQuery(hql1);
		  query1.setParameter("emailid", emailid);
		  query1.setParameter("password", password);
		  query1.setParameter("designation", designation);
		  query1.setParameter("status", "0");
		  List<staffmodel> li1 = query1.list();
		  for(staffmodel sm : li1)                                                                                                                                                  
		  {
			  flag = true;
			  System.out.println("STAFF: " + sm.getStaffname());
		  }
	 
		    session.getTransaction().commit();
		    return li1;
	
	}
	public List<staffmodel> hodlogin(String emailid, String password, String designation) 
	{
		boolean flag = false;
		
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  
		  String hql2 = "from staffmodel where emailid = :emailid and password = :password and designation = :designation ";
		  Query query2 = session.createQuery(hql2);
		  query2.setParameter("emailid", emailid);
		  query2.setParameter("password", password);
		  query2.setParameter("designation", designation);
		  List<staffmodel> li2 = query2.list();
		  for(staffmodel sm : li2)
		  {
			  flag = true;
			  System.out.println("HOD: " + sm.getStaffname());
		  }
	 
		    session.getTransaction().commit();
		    return li2;
	
	}
	
	public List<staffmodel> stafflist(String department,String designation) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql3 = "from staffmodel where department = :department and designation = :designation";
		  Query query3 = session.createQuery(hql3);
		  query3.setParameter("department", department);
		  query3.setParameter("designation", designation);
		  List<staffmodel> li3 = query3.list();
		  
		  session.getTransaction().commit();
		  
		  return li3;
	}
	
	public List<staffmodel> displayallstaff() 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql4 = "from staffmodel where status = :status";
		  Query query4 = session.createQuery(hql4);
		  query4.setParameter("status", "0");
		  List<staffmodel> li4 = query4.list();
		  
		  session.getTransaction().commit();
		  
		  return li4;
	}
	
	public int deleterecord(int id) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql5 = "update staffmodel set status = :status where id = :id" ;
		  Query query5 = session.createQuery(hql5);
		  query5.setParameter("id", id);
		  query5.setParameter("status","1");
		  int rowsAffected = query5.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Deleted " + rowsAffected + " rows.");
			}
			
		  session.getTransaction().commit();
		return rowsAffected;
		  
	}
	
	public int update(String staffname,String password, String address, String mobileno) // String department,String designation
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql6 = "update staffmodel set password = :password, address = :address, mobileno = :mobileno where staffname = :staffname";
		  Query query6 = session.createQuery(hql6);
		  query6.setParameter("staffname", staffname);
		  query6.setParameter("password", password);
		  query6.setParameter("address", address);
		  query6.setParameter("mobileno", mobileno);
		  
		  int rowsAffected = query6.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		return rowsAffected;
		  
	}
	
	public int forgot(String emailid, String password)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql7 = "update staffmodel set password = :password where emailid = :emailid";
		  Query query7 = session.createQuery(hql7);
		  query7.setParameter("emailid", emailid);
		  query7.setParameter("password", password);
			  
		  int rowsAffected = query7.executeUpdate();
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
