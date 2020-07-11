package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.servicedao;

@WebServlet("/admnseraprov")
public class admnseraprov extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
	       String a = request.getParameter("serid");
	       int serid = Integer.parseInt(a);
	       int d = 3;
	       String status = Integer.toString(d);
	       
	       servicedao srd = new servicedao();
	       int ser = srd.admnseraproval(serid, status);
	       
	       String msg = "Admin Approved 1 Service";
	       request.setAttribute("Message", msg);
	       page = "ad_index.jsp";
		   request.getRequestDispatcher(page).forward(request, response);
	       
	}

}
