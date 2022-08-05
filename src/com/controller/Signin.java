package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.model.User;

public class Signin extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user=new User();
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));
		
		UserDao ud=new UserDao();
		user=ud.loginUser(user);
		
		HttpSession sesion=req.getSession();
		sesion.setAttribute("Id",user.getId());
		sesion.setAttribute("Name",user.getName());
		resp.sendRedirect("home");
	}
}
