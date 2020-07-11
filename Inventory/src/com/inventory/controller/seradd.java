package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.servicedao;
import com.inventory.model.servicemodel;

@WebServlet("/seradd")
public class seradd extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "staff_serv.jsp";
		
			servicemodel sermod = new servicemodel();
			sermod.setName(request.getParameter("name"));
			sermod.setEmail(request.getParameter("email"));
			sermod.setDepartment(request.getParameter("dept"));
			sermod.setType(request.getParameter("type"));
			sermod.setTime(request.getParameter("time"));
			sermod.setMsg(request.getParameter("msg"));
			sermod.setStatus("1");
			
			servicedao srdo = new servicedao();
			srdo.seradd(sermod);
			
			String msg = "Apply 1 Service.";
			request.setAttribute("Message", msg);
			page = "staff_dash.jsp";
			request.getRequestDispatcher(page).forward(request, response);
		
	}

}
