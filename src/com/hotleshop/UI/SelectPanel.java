package com.hotleshop.UI;

import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SelectPanel extends JPanel {
	private DateChooser sdate;
	private DateChooser edate;
	private JButton query;
	public SelectPanel(){
		this.initCom();
		this.initSelectPanel();
	}
	public void initSelectPanel(){
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(sdate);
		this.add(edate);
		this.add(query);
	}
	public void initCom(){
		
		sdate=new DateChooser();
		edate=new DateChooser(new Date(new java.util.Date().getTime()+24*60*60*1000));//后移一天
		query=new JButton("查询");
	}
	public DateChooser getSdate() {
		return sdate;
	}
	public void setSdate(DateChooser sdate) {
		this.sdate = sdate;
	}
	public DateChooser getEdate() {
		return edate;
	}
	public void setEdate(DateChooser edate) {
		this.edate = edate;
	}
	public JButton getQuery() {
		return query;
	}
	public void setQuery(JButton query) {
		this.query = query;
	}
}
