package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.INTERNAL;

import com.inventory.dao.servicedao;
import com.inventory.model.servicemodel;

@WebServlet("/addetserm")
public class addetserm extends HttpServlet 
{
	List<servicemodel> li3 = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
			String a = request.getParameter("serid");
			int serid = Integer.parseInt(a);
			
			servicedao srd = new servicedao();
			li3 = srd.sermandet(serid);
			
			request.setAttribute("info3", li3);
			page = "ad_aprov_ser.jsp";
			request.getRequestDispatcher(page).forward(request, response);
			
		
	}

}
