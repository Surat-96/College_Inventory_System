package com.inventory.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inventory.dao.staffdao;

@WebServlet("/checkusername")
public class checkusername extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	 {
		String emailid = request.getParameter("email");
		System.out.print(emailid);
		
		boolean f = staffdao.staffnamecheck(emailid); 
		System.out.println(" Return 4m DAO  "+f);
		
		response.setContentType("text/xml");
        response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();
		if (f) 
        {
     	  out.println("<person>" + 
                           "<found>true</found>" + 
                           "<staffname>" + "Reply 4m Servlet"  + "</staffname>" +
          		      "</person>"
                     );
     	} 
         else 
         {
     	     out.println("<found>false</found>");
     	}
	}

}
