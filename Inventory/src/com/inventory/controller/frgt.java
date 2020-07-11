package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.dao.staffdao;

@WebServlet("/frgt")
public class frgt extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "frgtpass.jsp";
		//boolean flag = false;
		
		String emailid = request.getParameter("emailid") ;
		String password = request.getParameter("password") ;
		
		
			 staffdao sdd = new staffdao(); 
			 sdd.forgot(emailid, password);
			 
			 page = "index.jsp";
			 request.getRequestDispatcher(page).forward(request, response);
			
	}

}
