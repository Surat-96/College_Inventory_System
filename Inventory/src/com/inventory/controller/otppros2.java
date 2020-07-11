package com.inventory.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/otppros2")
public class otppros2 extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		
		HttpSession s2 = request.getSession(true);
		int otp= (Integer) s2.getAttribute("otp");
		
		String otpvalue=request.getParameter("otpval");
		int enterOtp=Integer.parseInt(otpvalue);
		
		if(otp==enterOtp)
		{
			 String msg = "OTP MATCHED, WELCOME ADC!!";
			 request.setAttribute("Message", msg);
			 page = "index.jsp";
			 request.getRequestDispatcher(page).forward(request, response);
		}
		else
		{
			String msg = "OTP NOT MATCHED";
			request.setAttribute("Message1", msg);
			page = "index.jsp";
			request.getRequestDispatcher(page).forward(request, response);
			
		}
	}

}
