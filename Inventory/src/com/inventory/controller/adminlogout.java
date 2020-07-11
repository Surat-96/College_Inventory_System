package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.dao.admindao;

@WebServlet("/adminlogout")
public class adminlogout extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
		admindao adao = new admindao();
		adao.logout();
		
		HttpSession ses1 = request.getSession(false);
		if(ses1 != null)
		{ses1.invalidate();}
		
		page = "index.jsp";
		request.getRequestDispatcher(page).forward(request, response);
	}

}
