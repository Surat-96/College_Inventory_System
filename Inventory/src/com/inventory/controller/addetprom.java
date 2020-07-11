package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.stckmangdao;
import com.inventory.model.applystock;

@WebServlet("/addetprom")
public class addetprom extends HttpServlet 
{
	List<applystock> li3 = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
			String a = request.getParameter("reqid");
			int reqid = Integer.parseInt(a);
			
			stckmangdao smd = new stckmangdao();
			li3 = smd.promandet(reqid);
			
			request.setAttribute("info3", li3);
			page = "ad_aprov_pro.jsp";
			request.getRequestDispatcher(page).forward(request, response);
			
		
	}

}
