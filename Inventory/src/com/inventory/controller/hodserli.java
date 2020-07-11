package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.servicedao;
import com.inventory.model.servicemodel;
import com.inventory.model.staffmodel;

@WebServlet("/hodserli")
public class hodserli extends HttpServlet 
{
	List<servicemodel> li1 = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
	       String department = request.getParameter("dept");
	       
	       		servicedao srdo = new servicedao();
	       		li1 = srdo.shwstck1(department);
	       		
	     request.setAttribute("info2", li1);
	     page = "hod_service.jsp";
	     request.getRequestDispatcher(page).forward(request, response);
		
	}

}
