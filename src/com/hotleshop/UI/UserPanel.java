package com.hotleshop.UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UserPanel extends JPanel {
	private String name;
	private JButton logout;
	private JButton Order;
	private JLabel welcome;
	public UserPanel(String u){
		this.name=u;
		this.initCom();
		this.initUserPanel();
	}
	public void initUserPanel(){
		this.setLayout(new GridBagLayout());
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.weightx=20;
		gbc.weighty=20;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=2;
		gbc.gridwidth=1;
		this.add(welcome,gbc);
		gbc.gridx=1;
		gbc.gridheight=1;
		this.add(Order,gbc);
		gbc.gridy=1;
		this.add(logout,gbc);
	}
	public void initCom(){
		this.logout=new JButton("登出");
		this.Order=new JButton("我的订单");
		this.welcome=new JLabel("欢迎"+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public JButton getLogout() {
		return logout;
	}
	public void setLogout(JButton logout) {
		this.logout = logout;
	}
	public JButton getOrder() {
		return Order;
	}
	public void setOrder(JButton order) {
		Order = order;
	}
	public JLabel getWelcome() {
		return welcome;
	}
	public void setWelcome(JLabel welcome) {
		this.welcome = welcome;
	}
}
