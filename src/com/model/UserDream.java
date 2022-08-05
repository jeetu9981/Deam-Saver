package com.model;

import java.sql.Date;

public class UserDream {
	private int id;
	private String date;
	private String dremName;
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String s) {
		this.date = s;
	}
	public String getDremName() {
		return dremName;
	}
	public void setDremName(String dremName) {
		this.dremName = dremName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public UserDream() {
		super();
	}
	public UserDream(String date, String dremName, int userId, String image) {
		super();
		this.date = date;
		this.dremName = dremName;
		this.userId = userId;
		this.image = image;
	}
	public UserDream(int id, String date, String dremName, int userId, String image) {
		super();
		this.id = id;
		this.date = date;
		this.dremName = dremName;
		this.userId = userId;
		this.image = image;
	}
	@Override
	public String toString() {
		return "UserDream [id=" + id + ", date=" + date + ", dremName=" + dremName + ", userId=" + userId + ", image="
				+ image + "]";
	}
	private String image;
}
