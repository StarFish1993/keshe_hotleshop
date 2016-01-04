package com.hotleshop.UI;

import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hotleshop.DBBean.Room;
import com.hotleshop.DBDAO.RoomDAO;

@SuppressWarnings("serial")
public class RoomPanel extends JPanel {
	private JLabel RID;
	private JLabel price;
	private JLabel name;
	private JLabel status;
	private JLabel date;
	private JButton order;
	private Room room=null;
	private Date sdate=null;
	private Date edate=null;
	public RoomPanel(){
	}
	public void initCom(){
		RID=new JLabel("房间号:"+room.getRID());
		name=new JLabel("房间名称:"+room.getRM().getName());
		price=new JLabel("价格:"+room.getRM().getPrciec());
		order=new JButton("预订");
		if(room.getStatus()==0||RoomDAO.isStatus(room, sdate, edate))
			status=new JLabel("房间状态：未被预订");
		else{
			status=new JLabel("房间状态：以被预订");
			date=new JLabel("预定时间："+room.getSdate().toString()+"到"+room.getEdate().toString());
		}
	}
	public JLabel getRID() {
		return RID;
	}
	public void setRID(JLabel rID) {
		RID = rID;
	}
	public JLabel getPrice() {
		return price;
	}
	public void setPrice(JLabel price) {
		this.price = price;
	}
	public JLabel getNAme() {
		return name;
	}
	public void setNAme(JLabel name) {
		this.name = name;
	}
	public JLabel getStatus() {
		return status;
	}
	public void setStatus(JLabel status) {
		this.status = status;
	}
}
