package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.stockdao;
import com.inventory.model.stockmodel;

@WebServlet("/shwstck")
public class shwstck extends HttpServlet 
{
	List<stockmodel> list = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "staffstocks_pre.jsp";
		
		String type = request.getParameter("type");
		
		stockdao sd = new stockdao();
		list = sd.viewstock(type);
		
	request.setAttribute("info", list);
	page = "staff_stocks.jsp";
	request.getRequestDispatcher(page).forward(request, response);
		
	}

}
