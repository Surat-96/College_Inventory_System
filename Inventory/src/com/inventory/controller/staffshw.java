package com.inventory.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.staffdao;
import com.inventory.model.staffmodel;

@WebServlet("/staffshw")
public class staffshw extends HttpServlet 
{
	List<staffmodel> list = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
		staffdao stdao = new staffdao();
		list = stdao.displayallstaff();
		
		request.setAttribute("info", list);
		page = "ad_manage_users.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
	}

}
