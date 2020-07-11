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

@WebServlet("/staffserli")
public class staffserli extends HttpServlet 
{
	List<servicemodel> li = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
	       String name = request.getParameter("staffname");
	       
	       servicedao srdo = new servicedao();
	       li = srdo.shwser(name);
	      
	     request.setAttribute("info2", li);
	     page = "staff_service.jsp";
	     request.getRequestDispatcher(page).forward(request, response);
	}

}
