package com.hotleshop.UI;

import com.hotleshop.DBBean.User;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		u.setName("yuheng");
		new ClientUI(u).setVisible(true);
	}

}
