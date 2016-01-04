package com.hotleshop.DBBean;

import java.sql.Date;

public class Order {
	private int OID;
	private int UID;
	private String CID;
	private int SID;
	private int RID;
	private Date sdate;
	private Date edate;
	private int paid;
	private int payable;
	public int getOID() {
		return OID;
	}
	public void setOID(int oID) {
		OID = oID;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public int getRID() {
		return RID;
	}
	public void setRID(int rID) {
		RID = rID;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	public int getPayable() {
		return payable;
	}
	public void setPayable(int payable) {
		this.payable = payable;
	}
}
