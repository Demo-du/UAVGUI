package com.uav.window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Show extends JPanel{
	public static int WIDTH=600;
	public static int HEIGHT=400;
	public void add(Component c,GridBagConstraints con,int x,int y,int w,int h){
		con.gridx=x;
		con.gridy=y;
		con.gridwidth=w;
		con.gridheight=h;
		add(c,con);
	}
    public Show(){
    	JFrame jf=new JFrame("无人机任务规划仿真系统");
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
		//===============================================================//
		JButton b1=new JButton("仿真选择");
		//b1.setBackground(Color.CYAN);
		//b1.setBounds(0,50,300,200);
		b1.setPreferredSize(new Dimension(150,100));
		JButton b2=new JButton("协同侦查开始");
		JButton b3=new JButton("协同侦查暂停");
		JButton b4=new JButton("兵力分配开始");
		JButton b5=new JButton("兵力分配暂停");
		JButton b6=new JButton("模拟突发情况");
		JLabel tab1=new JLabel("基本配置");
		tab1.setBackground(Color.blue);
		JLabel tab2=new JLabel("仿真实验");
		GridBagConstraints constaints=new GridBagConstraints();
		constaints.fill=GridBagConstraints.NONE;
		constaints.anchor=GridBagConstraints.CENTER;
		constaints.weightx=1200;
		constaints.weighty=800;
		add(tab1,constaints,0,0,300,50);
		add(b1,constaints,0,50,300,200);
		add(tab2,constaints,0,250,300,50);
		add(b2,constaints,0,300,300,100);
		add(b3,constaints,0,400,300,100);
		add(b4,constaints,0,500,300,100);
		add(b5,constaints,0,600,300,100);
		add(b6,constaints,0,700,300,100);
		//===============================================================//
		jf.setResizable(false);
		jf.setVisible(true);
    }
}
