package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.admindao;

@WebServlet("/adminupdt")
public class adminupdt extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "ad_change_password.jsp";
		
		String adminname = request.getParameter("adminname");
		String password = request.getParameter("password");
		
		admindao ad = new admindao();
		int a4 = ad.update(adminname,password);
		
		page = "ad_index.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
	}

}
