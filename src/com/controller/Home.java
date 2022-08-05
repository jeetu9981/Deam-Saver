package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDreamDao;
import com.model.UserDream;

public class Home extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDreamDao usd=new UserDreamDao();
		
		HttpSession s=req.getSession();
		ArrayList<UserDream> al=usd.getAllDreams((int)s.getAttribute("Id"));
		req.setAttribute("dreams",al);
		
		RequestDispatcher rq=req.getRequestDispatcher("Home.jsp");
		rq.forward(req,resp);
	}
}
