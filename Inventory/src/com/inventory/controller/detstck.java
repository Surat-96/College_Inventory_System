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

@WebServlet("/detstck")
public class detstck extends HttpServlet 
{
	List<stockmodel> list1 = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "staff_stocks.jsp";
		 
		String itemname = request.getParameter("itemname");
		
		stockdao sd = new stockdao();
		list1 = sd.stockdetails(itemname);
		
	request.setAttribute("info1", list1);
	page = "stock_details.jsp";
	request.getRequestDispatcher(page).forward(request, response);
	}

}
