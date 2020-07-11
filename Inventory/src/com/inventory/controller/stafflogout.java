package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.dao.staffdao;

@WebServlet("/stafflogout")
public class stafflogout extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
         String page;
		
		staffdao sdao = new staffdao();
		sdao.logout();
		
		HttpSession ses = request.getSession(false);
		if(ses != null)
		{ses.invalidate();}
		
		page = "index.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
	}

}
