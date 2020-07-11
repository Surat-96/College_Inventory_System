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

@WebServlet("/staffproli")
public class staffproli extends HttpServlet 
{
	List<applystock> li = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
	       String staffname = request.getParameter("staffname");
	       
	       stckmangdao smd = new stckmangdao();
	       li = smd.shwstck(staffname);  
	       
	     request.setAttribute("info2", li);
	     page = "staff_product.jsp";
	     request.getRequestDispatcher(page).forward(request, response);
	}

}
