package com.hotleshop.DBBean;

import java.sql.Date;

public class Room {
	private int RID;
	private RoomModle RM;
	private int status;
	private Date sdate;
	private Date edate;
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
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date date) {
		this.sdate = date;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date date) {
		this.edate = date;
	}
}
