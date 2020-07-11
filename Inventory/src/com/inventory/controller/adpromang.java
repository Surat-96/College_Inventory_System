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

@WebServlet("/adpromang")
public class adpromang extends HttpServlet 
{
	List<applystock> list = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String page;
		stckmangdao smdao = new stckmangdao();
		list = smdao.displyalstckmng();
		
		request.setAttribute("info", list);
		page = "ad_manage_pro_req.jsp";
		request.getRequestDispatcher(page).forward(request, response);
	}

}
