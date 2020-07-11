package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.servicedao;

@WebServlet("/hodnoaprov1")
public class hodnoaprov1 extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
	       String b = request.getParameter("serid");
	       int serid = Integer.parseInt(b);
	       int a = 0;
	       String status = Integer.toString(a);
	       
	       servicedao smd = new servicedao();
	       int s1 = smd.hodnoaproval(serid,status);
	       
	       String msg = "NotApproved 1 Service";
	       request.setAttribute("Message", msg);
	       page = "hod_dash.jsp";
		   request.getRequestDispatcher(page).forward(request, response);
	}

}
