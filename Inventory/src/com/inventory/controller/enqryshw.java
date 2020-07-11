package com.inventory.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.enqrydao;
import com.inventory.model.enqrymodel;

@WebServlet("/enqryshw")
public class enqryshw extends HttpServlet 
{
	List<enqrymodel> list = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		enqrydao edao = new enqrydao();
		list = edao.displayalled();
		
		request.setAttribute("info", list);
		page = "ad_manage_enquiries.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
	}

}
