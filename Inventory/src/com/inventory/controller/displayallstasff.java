package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.staffdao;
import com.inventory.model.staffmodel;

@WebServlet("/displayallstaff")
public class displayallstasff extends HttpServlet 
{
	List<staffmodel> list = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
       String page;
       String department = request.getParameter("depart");
       String designation = request.getParameter("desig");
		
		staffdao sdao = new staffdao();
		list = sdao.stafflist(department,designation);
		
		request.setAttribute("info", list);
		page = "staff_list.jsp";
		request.getRequestDispatcher(page).forward(request, response);
	}

}
