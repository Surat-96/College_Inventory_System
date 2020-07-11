package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.admindao;
import com.inventory.model.adminmodel;

@WebServlet("/adminregistration")
public class adminregistration extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "adminreg.jsp";
	       
		adminmodel am = new adminmodel();
		am.setAdminname(request.getParameter("adminname"));
		am.setEmailid(request.getParameter("email"));
		am.setPassword(request.getParameter("password"));
		am.setAddress(request.getParameter("address"));
		am.setMobileno(request.getParameter("mob"));
		
		admindao ad = new admindao();
		ad.register(am);
		
		page = "adminlog.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
	}

}
