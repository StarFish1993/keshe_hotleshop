package com.hotleshop.UI;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import com.hotleshop.DBBean.Room;

@SuppressWarnings("serial")
public class RoomsPanel extends JPanel {
	private ArrayList<Room> rooms;
	public RoomsPanel(ArrayList<Room> rs){
		rooms=rs;
		this.initRoomsPanel();
	}
	public void initRoomsPanel(){
		TableModel model=new RoomsTable(rooms);
		JTable ta=new JTable(model);
		this.add(new JScrollPane(ta));
	}
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
}
@SuppressWarnings("serial")
class RoomsTable extends AbstractTableModel{
	private ArrayList<Room> rooms;
	private static final String[] columnName={"房间号","价格","状态"};
	public RoomsTable(ArrayList<Room> rooms){
		this.rooms=rooms;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		if(rooms!=null)
			return rooms.size();
		else return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		int sta;
		if(rooms!=null){
			Room r=rooms.get(rowIndex);
			switch(columnIndex){
			case 0:return r.getRID();
			case 1:return r.getRM().getPrciec();
			case 2:return r.getStatus()==0?"未预定":"已预订";
			}
			return null;
		}
		else
			return null;
	}
	public String getColumnName(int c){
		return columnName[c];
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
}
