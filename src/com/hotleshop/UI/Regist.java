package com.hotleshop.UI;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * 注册界面
 * @author Yuheng
 *
 */
@SuppressWarnings("serial")
public class Regist extends JFrame {
	private JTextField username;
	private JTextField phone;
	private JTextField IDcard;
	private JPasswordField password;
	private JPasswordField repassword;
	private Map<String,JLabel> label;
	private JButton regist;
	private JButton back;
	private JButton exit;
	private final int WIDTH=400;
	private final int HEIGTH=400;
	public Regist(){
		this.initLabel();
		this.initComp();
		this.initRegist();
	}
	public void initComp(){
		this.username=new JTextField(10);
		this.username.setBounds(160, 80, 130, 20);
		this.phone=new JTextField(18);
		this.phone.setBounds(160, 110, 130, 20);
		this.IDcard=new JTextField(18);
		this.IDcard.setBounds(160, 140, 130, 20);
		this.password=new JPasswordField(18);
		this.password.setBounds(160, 170, 130, 20);
		this.repassword=new JPasswordField(18);
		this.repassword.setBounds(160, 200, 130, 20);
		this.regist=new JButton("注册");
		this.regist.setBounds(100, 250, 70, 30);
		this.back=new JButton("返回");
		this.back.setBounds(180, 250, 70, 30);
		this.exit=new JButton("退出");
		this.exit.setBounds(260, 250, 70, 30);
		label.get("注册").setBounds(0, 20, 400, 20);
		label.get("姓名").setBounds(100, 80, 50, 20);
		label.get("手机号").setBounds(100, 110, 50, 20);
		label.get("身份证").setBounds(100, 140, 50, 20);
		label.get("密码").setBounds(100, 170, 50, 20);
		label.get("重复密码").setBounds(50, 200, 100, 20);
	}
	public void initRegist(){
		int x=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;//获取屏幕长宽
		this.setTitle("注册");
		this.setLayout(null);
		this.setSize(WIDTH, HEIGTH);
		this.setResizable(false);
		this.setLocation(x/2-this.WIDTH/2,y/2-this.HEIGTH/2 );//设置到屏幕中央
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(username);
		this.add(phone);
		this.add(IDcard);
		this.add(password);
		this.add(repassword);
		this.add(regist);
		this.add(back);
		this.add(exit);
		this.add(label.get("注册"));
		this.add(label.get("姓名"));
		this.add(label.get("手机号"));
		this.add(label.get("身份证"));
		this.add(label.get("密码"));
		this.add(label.get("重复密码"));
	}
	public void initLabel(){
		label=new HashMap<String,JLabel>();
		label.put("注册", new JLabel("注册",JLabel.CENTER));
		label.put("姓名", new JLabel("姓名:",JLabel.RIGHT));
		label.put("手机号", new JLabel("手机号:",JLabel.RIGHT));
		label.put("身份证", new JLabel("身份证:",JLabel.RIGHT));
		label.put("密码", new JLabel("密码:",JLabel.RIGHT));
		label.put("重复密码", new JLabel("重复密码:",JLabel.RIGHT));
	}
	public JTextField getPhone() {
		return phone;
	}
	public void setPhone(JTextField phone) {
		this.phone = phone;
	}
	public JTextField getIDcard() {
		return IDcard;
	}
	public void setIDcard(JTextField iDcard) {
		IDcard = iDcard;
	}
	public JTextField getUsername() {
		return username;
	}
	public void setUsername(JTextField username) {
		this.username = username;
	}
	public JPasswordField getPassword() {
		return password;
	}
	public void setPassword(JPasswordField password) {
		this.password = password;
	}
	public JPasswordField getRepassword() {
		return repassword;
	}
	public void setRepassword(JPasswordField repassword) {
		this.repassword = repassword;
	}
	public JButton getRegist() {
		return regist;
	}
	public void setRegsit(JButton regist) {
		this.regist = regist;
	}
	public JButton getBack() {
		return back;
	}
	public void setBack(JButton back) {
		this.back = back;
	}
	public JButton getExit() {
		return exit;
	}
	public void setExit(JButton exit) {
		this.exit = exit;
	}
	public Map<String,JLabel> getLabel() {
		return label;
	}
	public void setLabel(Map<String,JLabel> label) {
		this.label = label;
	}
}
