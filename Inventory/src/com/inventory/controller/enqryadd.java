package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.enqrydao;
import com.inventory.model.enqrymodel;

@WebServlet("/enqryadd")
public class enqryadd extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "enquiry.jsp";
		 
		 enqrymodel em1 = new enqrymodel();
		 em1.setName(request.getParameter("name"));
		 em1.setEmail(request.getParameter("email"));
		 em1.setDepartment(request.getParameter("dept"));
		 em1.setDesignation(request.getParameter("desi"));
		 em1.setTime(request.getParameter("time"));
		 em1.setMsg(request.getParameter("msg"));
		
		 enqrydao ed = new enqrydao();
		 ed.register(em1);
		 
		 page = "staff_dash.jsp";
		request.getRequestDispatcher(page).forward(request, response);
	}

}
