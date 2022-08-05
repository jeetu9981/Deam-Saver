package com.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.dao.UserDreamDao;
import com.model.UserDream;

@MultipartConfig
public class AddDream extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		HttpSession session=req.getSession();
		
		Part p=req.getPart("image");
		String fileName=p.getSubmittedFileName().trim();
		InputStream is=p.getInputStream();
		String path="C:\\Users\\DELL\\Documents\\workspace-sts-3.9.10.RELEASE\\crud\\WebContent\\img\\"+fileName;
		int bytes=0;
		FileOutputStream fs=new FileOutputStream(path);
		while((bytes=is.read())!=-1)
			fs.write(bytes);
		fs.close();
		
		UserDream userDream=new UserDream();
		userDream.setDremName(req.getParameter("dreamName"));
		userDream.setImage(fileName);
		userDream.setUserId((int) session.getAttribute("Id"));
		userDream.setDate(req.getParameter("date"));
		
		UserDreamDao usd=new UserDreamDao();
		boolean a=usd.addDream(userDream);
		
		if(a)
			res.sendRedirect("home");
	}
}
