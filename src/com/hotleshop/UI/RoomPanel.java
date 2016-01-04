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
		RID=new JLabel("�����:"+room.getRID());
		name=new JLabel("��������:"+room.getRM().getName());
		price=new JLabel("�۸�:"+room.getRM().getPrciec());
		order=new JButton("Ԥ��");
		if(room.getStatus()==0||RoomDAO.isStatus(room, sdate, edate))
			status=new JLabel("����״̬��δ��Ԥ��");
		else{
			status=new JLabel("����״̬���Ա�Ԥ��");
			date=new JLabel("Ԥ��ʱ�䣺"+room.getSdate().toString()+"��"+room.getEdate().toString());
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
