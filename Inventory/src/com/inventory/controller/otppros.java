package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.inventory.dao.staffdao;
import com.inventory.model.staffmodel;

@WebServlet("/otppros")
public class otppros extends HttpServlet 
{
	List<staffmodel> list0 = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
		HttpSession s1 = request.getSession(true);
		
		String emailid = (String) s1.getAttribute("emailid");
		String password = (String)s1.getAttribute("password");
		String designation = (String)s1.getAttribute("designation");
		int otp= (Integer) s1.getAttribute("otp");
		
		String otpvalue=request.getParameter("otpval");
		int enterOtp=Integer.parseInt(otpvalue);
		
		if(otp==enterOtp)
		{
			 staffdao sdd = new staffdao(); 
			 list0 = sdd.stafflogin(emailid, password, designation);
			 
			 HttpSession ses = request.getSession(true);
			 ses.setAttribute("info0",list0);
			 
			 String msg = "OTP MATCHED";
			 request.setAttribute("Message", msg);
			 page = "staff_dash.jsp";
			 request.getRequestDispatcher(page).forward(request, response);
		}
		else
		{
			String msg = "OTP NOT MATCHED";
			request.setAttribute("Message", msg);
			page = "stafflogreg.jsp";
			request.getRequestDispatcher(page).forward(request, response);
			
		}
	}

}
