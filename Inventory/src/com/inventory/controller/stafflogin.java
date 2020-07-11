package com.inventory.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.service.EmailService;
import com.inventory.service.SMSService;

@WebServlet("/stafflogin")
public class stafflogin extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String page;
		//boolean flag = false;
		
		String emailid = request.getParameter("emailid") ;
		String password = request.getParameter("password") ;
		String designation = request.getParameter("desi");
		
		HttpSession s1 = request.getSession(true);
		s1.setAttribute("emailid",emailid); 
		s1.setAttribute("password",password);
		s1.setAttribute("designation", designation);
		
		Random rand = new Random();
		int otp = rand.nextInt(10000);
		s1.setAttribute("otp",otp);
		String emailbody = "CIS - "+otp+" IS YOUR COLLEGE INVENTORY VARIFICATION CODE. ";
		System.out.print(emailbody);
		
		//EmailService.sendEmail(emailid, emailbody);

		//response.sendRedirect("otp.jsp");
		
		String msg1 = "Successfully send OTP";
	 	request.setAttribute("Message", msg1);
	    page = "otp.jsp";
	 	request.getRequestDispatcher(page).forward(request, response);
		
	}

}
