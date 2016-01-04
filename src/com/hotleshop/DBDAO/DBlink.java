package com.hotleshop.DBDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBlink {
	private static String url="jdbc:mariadb://xuehai.3ef.me/hostel_message";
	private static String username="keshe";
	private static String password="201312010";
	private static Connection con;
	static{
		try {
			con=DriverManager.getConnection(url,username,password);
			System.out.println("连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getCon(){
		return con;
	}
	public static Statement getStat() throws SQLException{
		return con.createStatement();
	}
}
