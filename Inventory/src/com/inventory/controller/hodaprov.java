package com.inventory.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.stckmangdao;


@WebServlet("/hodaprov")
public class hodaprov extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
	       String b = request.getParameter("reqid");
	       int reqid = Integer.parseInt(b);
	       int a = 2;
	       String status = Integer.toString(a);
	       
	       stckmangdao smd = new stckmangdao();
	       int s1 = smd.hodaproval(reqid,status);
	       
	       String msg = "Approved 1 Item";
	       request.setAttribute("Message", msg);
	       page = "hod_dash.jsp";
		   request.getRequestDispatcher(page).forward(request, response);
		
	}

}
