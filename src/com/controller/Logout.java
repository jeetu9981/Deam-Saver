package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
		HttpSession s=req.getSession();
		s.removeAttribute("Id");
		s.removeAttribute("Name");
		resp.sendRedirect("Signin.jsp");
	}
}
