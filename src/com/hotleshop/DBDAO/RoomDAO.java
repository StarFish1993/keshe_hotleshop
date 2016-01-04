package com.hotleshop.DBDAO;

import java.sql.Date;
import java.util.ArrayList;

import com.hotleshop.DBBean.Room;

public class RoomDAO {
	public static ArrayList<Room> getRooms(){
		ArrayList<Room> rooms=null;
		return rooms;
	}
	public static void updataRoom(Date d,int status){
		
	}
	public static boolean isStatus(Room r,Date s,Date e){
		return r.getSdate().after(e)&&r.getEdate().before(s);
	}
}
