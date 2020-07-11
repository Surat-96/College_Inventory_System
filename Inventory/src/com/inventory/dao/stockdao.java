package com.inventory.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.inventory.util.HibernateUtil;
import com.inventory.model.stockmodel;

public class stockdao 
{
	public String add(stockmodel sm) 
	{
		  String msg = "Adding unsuccessful, try again.....";
		  
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  session.save(sm);
		  
		  msg = "Itemname " + sm.getItemname()+ " adding successfully";
		  
		  System.out.println("msg:" + msg);

		  session.getTransaction().commit();
		
		  return msg; 
	}
	
	public List<stockmodel> viewstock(String type) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql1 = "from stockmodel where type = :type";
		  Query query = session.createQuery(hql1);
		  query.setParameter("type", type);
		  List<stockmodel> list = query.list();
		  
		  session.getTransaction().commit();
		  
		  return list;
	}
	
	public List<stockmodel> stockdetails(String itemname) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql1 = "from stockmodel where itemname = :itemname";
		  Query query = session.createQuery(hql1);
		  query.setParameter("itemname", itemname);
		  List<stockmodel> list = query.list();
		  
		  session.getTransaction().commit();
		  
		  return list;
	}
	
	public int updateitem(String itemname, String details, String purchasedate, String warrenty, String cost, String quantity)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql2 = "update stockmodel set details = :details, purchasedate = :purchasedate, warrenty = :warrenty, cost = :cost, quantity = :quantity where itemname = :itemname";
		  Query query2 = session.createQuery(hql2);
		  query2.setParameter("itemname", itemname);
		  query2.setParameter("details", details);
		  query2.setParameter("purchasedate", purchasedate);
		  query2.setParameter("warrenty", warrenty);
		  query2.setParameter("cost", cost);
		  query2.setParameter("quantity", quantity);
		  
		  int rowsAffected = query2.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		return rowsAffected;
	}
	
	public int itemmang(String itemname, String quantity)
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql3 = "update stockmodel set quantity = :quantity where itemname = :itemname";
		  Query query3 = session.createQuery(hql3);
		  query3.setParameter("itemname", itemname);
		  query3.setParameter("quantity", quantity);
		  
		  int rowsAffected = query3.executeUpdate();
			if (rowsAffected > 0) 
			{
			    System.out.println("Updated " + rowsAffected + " rows.");
			}
		  
		  
		  session.getTransaction().commit();
		return rowsAffected;
	}
	
	public List<stockmodel> stockdetails1(int id) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	 	  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  String hql4 = "from stockmodel where id = :id";
		  Query query4 = session.createQuery(hql4);
		  query4.setParameter("id", id);
		  List<stockmodel> list = query4.list();
		  
		  session.getTransaction().commit();
		  
		  return list;
	}

}
