package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.UserDream;
import com.util.GetConnection;

public class UserDreamDao {
	public boolean addDream(UserDream dream) {
		Connection con=GetConnection.getConnection();
		try {
			String q="insert into dream(dreamName,achieveDAte,image,userId) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setString(1, dream.getDremName());
			ps.setString(2, dream.getDate());
			ps.setString(3, dream.getImage());
			ps.setInt(4,dream.getUserId() );
			int a=ps.executeUpdate();
			if(a>0)
				return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<UserDream> getAllDreams(int id){
		ArrayList<UserDream> u=new ArrayList<UserDream>();
		Connection con=GetConnection.getConnection();
		try {
			String q="select d.id,d.dreamName,d.achieveDAte,d.image,d.userId from dream d inner join user u on d.userId=u.id and d.userId=?";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setInt(1,id);
			ResultSet a=ps.executeQuery();
			while(a.next()) {
				UserDream user=new UserDream();
				user.setId(a.getInt(1));
				user.setDate(a.getString(3));
				user.setDremName(a.getString(2));
				user.setImage(a.getString(4));
				user.setUserId(a.getInt(5));
				u.add(user);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public boolean delete(int id){
		Connection con=GetConnection.getConnection();
		try {
			String q="delete from dream where id=?";
			PreparedStatement ps=con.prepareStatement(q);
			ps.setInt(1,id);
			int i=ps.executeUpdate();
			if(i>0)
				return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
