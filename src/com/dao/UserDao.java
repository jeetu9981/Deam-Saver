package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import com.model.User;
import com.util.GetConnection;

public class UserDao {
	public boolean addUser(User user) {
		Connection con=GetConnection.getConnection();
		
		try {
			String query="insert into user(name,email,password) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			int n=ps.executeUpdate();
			if(n>0)
				return true;
		}	
		catch(Exception e) {
			
		}
		return false;
	}
	
	public User loginUser(User user) {
		Connection con=GetConnection.getConnection();
		try {
			String q="select * from user where email=? and password=?";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				user.setEmail(rs.getString(3));
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
















