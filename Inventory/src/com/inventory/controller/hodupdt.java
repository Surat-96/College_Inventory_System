package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.dao.staffdao;
import com.inventory.model.staffmodel;

@WebServlet("/hodupdt")
public class hodupdt extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "hod_update.jsp";
		
		String staffname = request.getParameter("staffname");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String mobileno = request.getParameter("mob");
		
			staffdao sd = new staffdao();
			int a = sd.update(staffname, password, address, mobileno);
			
			page = "hod_dash.jsp";
			request.getRequestDispatcher(page).forward(request, response);
		
	}

}
