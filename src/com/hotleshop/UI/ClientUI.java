package com.hotleshop.UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import com.hotleshop.DBBean.User;

@SuppressWarnings("serial")
public class ClientUI extends JFrame {
	private SelectPanel sp;
	private UserPanel up;
	private RoomPanel rp;
	private RoomsPanel rsp;
	private User user;
	private final int WIDTH=550;
	private final int HEIGTH=550;
	public ClientUI(User u){
		this.user=u;
		this.initCom();
		this.initClientUI();
	}
	public void initCom(){
		sp=new SelectPanel();
		up=new UserPanel(user.getName());
		rp=new RoomPanel();
		rsp=new RoomsPanel(null);
	}
	public void initClientUI(){
		int x=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;//获取屏幕长宽
		this.setTitle("注册");
		this.setLayout(new GridBagLayout());
		this.setSize(this.WIDTH, this.HEIGTH);
		this.setResizable(false);
		this.setLocation(x/2-this.WIDTH/2,y/2-this.HEIGTH/2 );//设置到屏幕中央
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagConstraints gbc=new GridBagConstraints();
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=1;
		gbc.gridwidth=1;
		this.add(up,gbc);
		gbc.weightx=100;
		gbc.weighty=0;
		gbc.gridx=1;
		this.add(sp, gbc);
		gbc.weightx=400;
		gbc.weighty=400;
		gbc.gridy=1;
		gbc.gridx=0;
		gbc.gridwidth=2;
		this.add(rsp, gbc);		
	}
	public SelectPanel getSp() {
		return sp;
	}
	public void setSp(SelectPanel sp) {
		this.sp = sp;
	}
	public UserPanel getUp() {
		return up;
	}
	public void setUp(UserPanel up) {
		this.up = up;
	}
	public RoomPanel getRp() {
		return rp;
	}
	public void setRp(RoomPanel rp) {
		this.rp = rp;
	}
	public RoomsPanel getRsp() {
		return rsp;
	}
	public void setRsp(RoomsPanel rsp) {
		this.rsp = rsp;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}