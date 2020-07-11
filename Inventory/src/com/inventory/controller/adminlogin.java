package com.inventory.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.dao.admindao;
import com.inventory.model.adminmodel;

@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet 
{
	List<adminmodel> list2 = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "adminlog.jsp"; 
		
		String adminname = request.getParameter("adminname") ;
		String password = request.getParameter("password") ;
		
		admindao ad = new admindao(); 
		list2 = ad.login(adminname, password );
		System.out.println("Login success!!!");
		
		HttpSession ses1 = request.getSession();
		ses1.setAttribute("info2",list2);	 
		page = "ad_index.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
	}

}
