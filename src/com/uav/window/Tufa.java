package com.uav.window;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class Tufa extends JPanel{
	public static int WIDTH=250;
	public static int HEIGHT=200;
	public void add(Component c,GridBagConstraints con,int x,int y,int w,int h){
		con.gridx=x;
		con.gridy=y;
		con.gridwidth=w;
		con.gridheight=h;
		add(c,con);
	}
	public Tufa(){
		final JFrame jf=new JFrame("添加突发情况");
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
		JButton b3=new JButton("添加突发情况UAV");
		JLabel L1=new JLabel("  仿真突发情况UAV编号选择");
		JLabel L2=new JLabel("  ");
		JLabel tm1=new JLabel("  ");
		JLabel tm2=new JLabel("  ");
		JLabel tm3=new JLabel("  ");
		JList list=new JList(Global.v);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(BorderFactory.createTitledBorder(""));
		GridBagConstraints constaints=new GridBagConstraints();
		constaints.fill=GridBagConstraints.NONE;
		constaints.anchor=GridBagConstraints.CENTER;
		constaints.weightx=250;
		constaints.weighty=200;
		add(L1,constaints,0,0,250,50);
		add(list,constaints,0,50,250,100);
		add(tm1,constaints,0,150,30,50);
		add(b1,constaints,30,150,80,50);
		add(tm2,constaints,110,150,30,50);
		add(b2,constaints,140,150,80,50);
		add(tm3,constaints,220,150,30,50);
		//========================================//
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
				//new Show();
			}
			
		});
	}
}
