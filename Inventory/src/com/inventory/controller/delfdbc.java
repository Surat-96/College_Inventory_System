package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.enqrydao;

@WebServlet("/delfdbc")
public class delfdbc extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
		String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		//System.out.println(id);
		
		enqrydao ed = new enqrydao();
		int del = ed.delfdbc(id);
		 
		page = "ad_index.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
	}

}
