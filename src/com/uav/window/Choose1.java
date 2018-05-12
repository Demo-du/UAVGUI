package com.uav.window;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Choose1 extends JPanel{
	public static int WIDTH=300;
	public static int HEIGHT=150;
	public void add(Component c,GridBagConstraints con,int x,int y,int w,int h){
		con.gridx=x;
		con.gridy=y;
		con.gridwidth=w;
		con.gridheight=h;
		add(c,con);
	}
	public Choose1(){
		final JFrame jf=new JFrame("仿真选择");
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
		JButton b1=new JButton("协同侦查仿真配置");
		JButton b2=new JButton("兵力分配仿真配置");
		GridBagConstraints constaints=new GridBagConstraints();
		constaints.fill=GridBagConstraints.NONE;
		constaints.anchor=GridBagConstraints.CENTER;
		constaints.weightx=300;
		constaints.weighty=150;
		add(b1,constaints,0,100,80,80);
		add(b2,constaints,0,200,80,80);
		//=====================================//
		jf.setResizable(false);
		jf.setVisible(true);
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("sssss");
				jf.dispose();
			}
			
		});
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("sssss");
				jf.dispose();
			}
			
		});
	}
}
