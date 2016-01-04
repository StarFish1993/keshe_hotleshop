package com.hotleshop.UI;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * ע�����
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
		this.regist=new JButton("ע��");
		this.regist.setBounds(100, 250, 70, 30);
		this.back=new JButton("����");
		this.back.setBounds(180, 250, 70, 30);
		this.exit=new JButton("�˳�");
		this.exit.setBounds(260, 250, 70, 30);
		label.get("ע��").setBounds(0, 20, 400, 20);
		label.get("����").setBounds(100, 80, 50, 20);
		label.get("�ֻ���").setBounds(100, 110, 50, 20);
		label.get("���֤").setBounds(100, 140, 50, 20);
		label.get("����").setBounds(100, 170, 50, 20);
		label.get("�ظ�����").setBounds(50, 200, 100, 20);
	}
	public void initRegist(){
		int x=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;//��ȡ��Ļ����
		this.setTitle("ע��");
		this.setLayout(null);
		this.setSize(WIDTH, HEIGTH);
		this.setResizable(false);
		this.setLocation(x/2-this.WIDTH/2,y/2-this.HEIGTH/2 );//���õ���Ļ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(username);
		this.add(phone);
		this.add(IDcard);
		this.add(password);
		this.add(repassword);
		this.add(regist);
		this.add(back);
		this.add(exit);
		this.add(label.get("ע��"));
		this.add(label.get("����"));
		this.add(label.get("�ֻ���"));
		this.add(label.get("���֤"));
		this.add(label.get("����"));
		this.add(label.get("�ظ�����"));
	}
	public void initLabel(){
		label=new HashMap<String,JLabel>();
		label.put("ע��", new JLabel("ע��",JLabel.CENTER));
		label.put("����", new JLabel("����:",JLabel.RIGHT));
		label.put("�ֻ���", new JLabel("�ֻ���:",JLabel.RIGHT));
		label.put("���֤", new JLabel("���֤:",JLabel.RIGHT));
		label.put("����", new JLabel("����:",JLabel.RIGHT));
		label.put("�ظ�����", new JLabel("�ظ�����:",JLabel.RIGHT));
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
