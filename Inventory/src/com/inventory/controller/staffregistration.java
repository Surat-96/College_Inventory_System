package com.inventory.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.inventory.dao.staffdao;
import com.inventory.model.staffmodel;
import com.inventory.service.EmailService;

@WebServlet("/staffregistration")
public class staffregistration extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        String page = "userlogreg.jsp";
		
		staffmodel sm = new staffmodel();
		sm.setStaffname(request.getParameter("staffname"));
		sm.setEmailid(request.getParameter("email"));
		sm.setPassword(request.getParameter("password"));
		sm.setAddress(request.getParameter("address"));
		sm.setJoiningDate(request.getParameter("doj"));
		sm.setMobileno(request.getParameter("mob"));
		sm.setDepartment(request.getParameter("dept"));
		sm.setDesignation(request.getParameter("desi"));
		sm.setStatus("0");
		
		HttpSession s2 = request.getSession(true);
		
		Random rand = new Random();
		int otp = rand.nextInt(10000);
		s2.setAttribute("otp",otp);
		//System.out.print(otp);
		
		String emailid = sm.getEmailid();
		String emailbody = "CIS - "+otp+" IS YOUR COLLEGE INVENTORY VARIFICATION CODE. ";
		System.out.print(emailbody);
		
		//EmailService.sendEmail(emailid, emailbody);
		
		String msg1 = "Successfully send OTP";
	 	request.setAttribute("Message", msg1);
	    page = "otp2.jsp";
	 	request.getRequestDispatcher(page).forward(request, response);
		
		staffdao sd = new staffdao();
		sd.register(sm);
		
		/*page = "index.jsp";
		request.getRequestDispatcher(page).forward(request, response);*/
		
	}

}
