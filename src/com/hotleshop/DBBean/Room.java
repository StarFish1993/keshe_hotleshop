package com.hotleshop.DBBean;

import java.sql.Date;

public class Room {
	private int RID;
	private RoomModle RM;
	private int status;
	private Date date;
	public int getRID() {
		return RID;
	}
	public void setRID(int rID) {
		RID = rID;
	}
	public RoomModle getRM() {
		return RM;
	}
	public void setRM(RoomModle rM) {
		RM = rM;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
