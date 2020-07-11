package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.servicedao;
import com.inventory.model.servicemodel;

@WebServlet("/adsermang")
public class adsermang extends HttpServlet 
{
	List<servicemodel> list = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
			
			servicedao srd = new servicedao();
			list = srd.displyalsermng();
			
		request.setAttribute("info", list);
		page = "ad_manage_ser_req.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
	}

}
