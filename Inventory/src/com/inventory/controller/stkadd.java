package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.stockdao;
import com.inventory.model.stockmodel;


@WebServlet("/stkadd")
public class stkadd extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "ad_create.jsp";
		
		stockmodel sm = new stockmodel();
		sm.setItemname(request.getParameter("itemname"));
		sm.setType(request.getParameter("type"));
		sm.setDetails(request.getParameter("details"));
		sm.setPurchasedate(request.getParameter("pdate"));
		sm.setWarrenty(request.getParameter("warrenty"));
		sm.setCost(request.getParameter("cost"));
		sm.setQuantity(request.getParameter("quant"));
		sm.setImage(request.getParameter("image"));
		
		stockdao sd = new stockdao();
		sd.add(sm);
		
		page = "ad_index.jsp";
		request.getRequestDispatcher(page).forward(request, response);
	}

}
