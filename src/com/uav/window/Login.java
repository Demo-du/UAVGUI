package com.uav.window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel{
	public static int WIDTH=300;
	public static int HEIGHT=150;
	public void add(Component c,GridBagConstraints con,int x,int y,int w,int h){
		con.gridx=x;
		con.gridy=y;
		con.gridwidth=w;
		con.gridheight=h;
		add(c,con);
	}
	public Login(){
		final JFrame jf=new JFrame("Login");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		jf.add(this,BorderLayout.WEST);
		jf.setSize(WIDTH, HEIGHT);
		Toolkit kit=Toolkit.getDefaultToolkit();//设置顶层容器框架为居中
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		jf.setLocation(x, y);
		//========================================//
		JButton b1=new JButton("确定");
		JButton b2=new JButton("取消");
		JLabel name=new JLabel("  用户名");
		JLabel password=new JLabel("  密码");
		final JTextField nameinput=new JTextField(15);
		final JPasswordField passwordinput=new JPasswordField(15);
		GridBagConstraints constaints=new GridBagConstraints();
		constaints.fill=GridBagConstraints.NONE;
		constaints.anchor=GridBagConstraints.CENTER;
		constaints.weightx=300;
		constaints.weighty=150;
		add(name,constaints,70,100,80,80);
		add(password,constaints,70,200,80,80);
		add(nameinput,constaints,320,100,40,80);
		add(passwordinput,constaints,320,200,40,80);
		add(b1,constaints,180,300,80,80);
		add(b2,constaints,280,300,80,80);
		jf.setResizable(false);
		jf.setVisible(true);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("sssss");
				jf.dispose();
				new Show();
			}
			
		});
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("sssss");
				jf.dispose();
				//new Show();
			}
			
		});
		//jp.add(b1);
		//jp.add(b2);
	}
	
}
