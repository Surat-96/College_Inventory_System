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

@WebServlet("/hodproli")
public class hodproli extends HttpServlet
{
	List<applystock> li1 = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
	       String department = request.getParameter("dept");
	       
	       stckmangdao smd = new stckmangdao();
	       li1 = smd.shwstck1(department);
	       
	     request.setAttribute("info2", li1);
	     page = "hod_product.jsp";
	     request.getRequestDispatcher(page).forward(request, response);
		
	}

}
