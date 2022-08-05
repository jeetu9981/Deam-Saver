package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDreamDao;

public class Delete extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDreamDao usd=new UserDreamDao();
		boolean b=usd.delete(Integer.parseInt(req.getParameter("id")));
		if(b)
			resp.sendRedirect("home");
	}
}
