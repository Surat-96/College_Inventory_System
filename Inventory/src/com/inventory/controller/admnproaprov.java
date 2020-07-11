package com.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.stckmangdao;
import com.inventory.dao.stockdao;

@WebServlet("/admnproaprov")
public class admnproaprov extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
	       String a = request.getParameter("reqid");
	       int reqid = Integer.parseInt(a);
	       String itemname = request.getParameter("iname");
		   String b = request.getParameter("quant");
		   //System.out.print(b);
		   int qty = Integer.parseInt(b);
		   String c = request.getParameter("reqquant");
		   //System.out.print(c);
		   int reqty = Integer.parseInt(c);
		   int quant = qty-reqty;
		   String quantity = Integer.toString(quant);
	       int d = 3;
	       String status = Integer.toString(d);
	       
	       stockdao std = new stockdao();
	       int q = std.itemmang(itemname, quantity);
	       
	       stckmangdao smd = new stckmangdao();
	       int s1 = smd.admnproaproval(reqid,status);
	       
	       String msg = "Admin Approved 1 Item";
	       request.setAttribute("Message", msg);
	       page = "ad_index.jsp";
		   request.getRequestDispatcher(page).forward(request, response);
	}

}
