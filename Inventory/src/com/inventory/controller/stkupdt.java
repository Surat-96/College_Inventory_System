package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.stockdao;

/**
 * Servlet implementation class stkupdt
 */
@WebServlet("/stkupdt")
public class stkupdt extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "ad_update_stocks.jsp";
		
		String itemname = request.getParameter("itemname");
		String details = request.getParameter("details");
		String purchasedate = request.getParameter("pdate");
		String warrenty = request.getParameter("warrenty");
		String cost = request.getParameter("cost");
		String quantity = request.getParameter("quant");
		
			stockdao sd = new stockdao();
			int a1 = sd.updateitem(itemname,details,purchasedate,warrenty,cost,quantity);
			
			page = "ad_index.jsp";
			request.getRequestDispatcher(page).forward(request, response);
	}

}
