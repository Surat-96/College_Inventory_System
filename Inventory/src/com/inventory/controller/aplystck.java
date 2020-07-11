package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.stckmangdao;
import com.inventory.model.applystock;

@WebServlet("/aplystck")
public class aplystck extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page = "stock_details.jsp";
		
		applystock as = new applystock();
		as.setStaffname(request.getParameter("staffname"));
		as.setDepartment(request.getParameter("dept"));
		as.setItemname(request.getParameter("itemname"));
		as.setQuantity(request.getParameter("quant"));
		as.setReq_quant(request.getParameter("reqquant"));
		as.setDate(request.getParameter("time"));
		as.setStatus("1");
		
		stckmangdao smd = new stckmangdao();
		smd.add(as);
		
		String msg = "Apply 1 Item.";
		request.setAttribute("Message", msg);
		page = "staff_dash.jsp";
		request.getRequestDispatcher(page).forward(request, response);
		
		
	}

}
