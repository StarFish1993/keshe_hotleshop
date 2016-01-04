package com.hotleshop.UI;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * �������
 * @author Yuheng
 *
 */
@SuppressWarnings("serial")//����Ϊ���л��ľ���
public class Login extends JFrame {
	private JTextField username;
	private JPasswordField password;
	private JButton login;
	private JButton exit;
	private JButton regist;
	private Map<String,JLabel> label;
	private final int WIDTH=400;
	private final int HEIGHT=300;
	public Login() {
		// TODO Auto-generated constructor stub
		this.initLabel();
		label.get("�������").setBounds(0, 20, 400, 20);
		this.add(label.get("�������"));
		label.get("�û���").setBounds(100, 80, 50, 20);
		this.add(label.get("�û���"));
		label.get("����").setBounds(100, 110, 50, 20);
		this.add(label.get("����"));
		username=new JTextField(20);
		username.setBounds(160,80, 130, 20);
		this.add(username);
		password=new JPasswordField(18);
		password.setBounds(160, 110, 130, 20);
		this.add(password);
		login=new JButton("����");
		login.setBounds(100, 160, 70, 30);
		this.add(login);
		exit=new JButton("�˳�");
		exit.setBounds(260, 160, 70, 30);
		this.add(exit);
		regist=new JButton("ע��");
		regist.setBounds(180, 160, 70, 30);
		this.add(regist);
		this.initLogin();
	}
	/**
	 * ��ʼ������������õ��ı�ǩ
	 */
	public void initLabel(){
		label=new HashMap<String,JLabel>();
		label.put("�û���",new JLabel("�û���:",JLabel.RIGHT) );
		label.put("����", new JLabel("����:",JLabel.RIGHT));
		label.put("�������", new JLabel("�������",JLabel.CENTER));
	}
	/**
	 * ��ʼ���������
	 */
	public void initLogin(){
		int x=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		int y=(int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;//��ȡ��Ļ����
		this.setTitle("����");
		this.setLayout(null);
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setLocation(x/2-this.WIDTH/2,y/2-this.HEIGHT/2 );//���õ���Ļ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JTextField getUsername() {
		return username;
	}
	public void setUsername(JTextField username) {
		this.username = username;
	}
	public JTextField getPassword() {
		return password;
	}
	public void setPassword(JPasswordField password) {
		this.password = password;
	}
	public JButton getLogin() {
		return login;
	}
	public void setLogin(JButton login) {
		this.login = login;
	}
	public JButton getExit() {
		return exit;
	}
	public void setExit(JButton exit) {
		this.exit = exit;
	}
	public JButton getRegist() {
		return regist;
	}
	public void setRegist(JButton regist) {
		this.regist = regist;
	}
	public Map<String,JLabel> getLabel() {
		return label;
	}
	public void setLabel(Map<String,JLabel> label) {
		this.label = label;
	}
}
