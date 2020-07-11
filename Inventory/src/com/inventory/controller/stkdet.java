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

@WebServlet("/stkdet")
public class stkdet extends HttpServlet 
{
	List<stockmodel> list1 = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "ad_manage_stocks.jsp";
		 
			String i = request.getParameter("id");
			int id = Integer.parseInt(i);
			
			stockdao sd = new stockdao();
			list1 = sd.stockdetails1(id);
			
		request.setAttribute("info1", list1);
		page = "ad_update_stocks.jsp";
		request.getRequestDispatcher(page).forward(request, response);
	}

}
